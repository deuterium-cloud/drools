package cloud.deuterium.drool.controller;

import cloud.deuterium.drool.model.Discount;
import cloud.deuterium.drool.model.Order;
import cloud.deuterium.drool.service.DiscountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Milan Stojkovic 26-Apr-2022
 *
 */

@RestController
@RequestMapping("/v1/drool")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping("/order")
    public ResponseEntity<Order> getOrderWithDiscount(@RequestBody Order order) {
        discountService.applyDiscount(order);
        return ResponseEntity.ok(order);
    }

    @PostMapping("/discount")
    public ResponseEntity<Discount> getDiscount(@RequestBody Order order) {
        Discount discount = discountService.calculateDiscount(order);
        return ResponseEntity.ok(discount);
    }

}
