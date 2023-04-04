package com.orderservicebackedn.orderservice.controller;

import com.orderservicebackedn.orderservice.model.ItemOrder;
import com.orderservicebackedn.orderservice.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("/orders")
    private List<ItemOrder> getOrders() {
        return orderRepo.findAll();
    }

    @PostMapping("/orders/add/")
    private List<ItemOrder> addOrder(@RequestBody ItemOrder itemOrder) {
        orderRepo.save(itemOrder);
        return orderRepo.findAll();
    }

}
