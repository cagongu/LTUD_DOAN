package com.dacs.springboot.ecommerce.controller;

import com.dacs.springboot.ecommerce.dto.Purchase;
import com.dacs.springboot.ecommerce.dto.PurchaseResponse;
import com.dacs.springboot.ecommerce.service.CheckoutService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
@AllArgsConstructor
public class CheckoutController {

    private final CheckoutService checkoutService;

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}


