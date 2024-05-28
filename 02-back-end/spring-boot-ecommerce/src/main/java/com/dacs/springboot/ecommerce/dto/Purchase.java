package com.dacs.springboot.ecommerce.dto;


import com.dacs.springboot.ecommerce.entity.Address;
import com.dacs.springboot.ecommerce.entity.Customer;
import com.dacs.springboot.ecommerce.entity.Order;
import com.dacs.springboot.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
