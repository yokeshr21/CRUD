package com.example.crud.controller;

import com.example.crud.entity.Order;
import com.example.crud.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }


    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }


    @PutMapping("/{id}")
    public Order updateOrder(
            @PathVariable Long id,
            @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }


    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "Order deleted successfully";
    }
}