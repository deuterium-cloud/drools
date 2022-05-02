package cloud.deuterium.drool.service;

import cloud.deuterium.drool.model.Discount;
import cloud.deuterium.drool.model.Order;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milan Stojkovic 27-Apr-2022
 */

@Service
public class DiscountService {

    private final KieContainer kieContainer;
    private final List<String> items = List.of("mouse", "keyboard", "speaker", "monitor");

    public DiscountService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void applyDiscount(Order order){
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    public Discount calculateDiscount(Order order){
        KieSession kieSession = kieContainer.newKieSession();
        Discount discount = new Discount();
        kieSession.setGlobal("items", new ArrayList<>(items));
        kieSession.setGlobal("discount", discount);
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
        return discount;
    }
}
