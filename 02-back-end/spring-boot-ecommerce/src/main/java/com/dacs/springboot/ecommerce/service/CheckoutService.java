package com.dacs.springboot.ecommerce.service;

import com.dacs.springboot.ecommerce.dto.Purchase;
import com.dacs.springboot.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
