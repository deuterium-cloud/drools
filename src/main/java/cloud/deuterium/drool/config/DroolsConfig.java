package cloud.deuterium.drool.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Milan Stojkovic 25-Apr-2022
 */

@Configuration
public class DroolsConfig {

    private static final String RULES_ORDER_RULES_DRL = "rules/order.drl";
    private static final String RULES_DISCOUNT_RULES_DRL = "rules/cumulative-discount.drl";

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();

        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_ORDER_RULES_DRL));
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_DISCOUNT_RULES_DRL));

        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}
