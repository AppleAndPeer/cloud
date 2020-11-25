package com.me.test.controller;

import com.me.test.basic.MessagePackage;
import com.me.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("order")
    public MessagePackage getOrder() {
        return new MessagePackage<>(orderService.getOrders());
    }

}