package com.emsi.orderservice.web;

import com.emsi.orderservice.entities.Order;
import com.emsi.orderservice.repositories.OrderRepository;
import com.emsi.orderservice.repositories.ProductItemRepository;
import com.emsi.orderservice.services.CustomerRestClientService;
import com.emsi.orderservice.services.InventoryRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderRestController {
private OrderRepository orderRepository;
private ProductItemRepository productItemRepository;
private CustomerRestClientService customerRestClientService;
private InventoryRestClientService inventoryRestClientService;

    public OrderRestController(OrderRepository orderRepository, ProductItemRepository productItemRepository, CustomerRestClientService customerRestClientService, InventoryRestClientService inventoryRestClientService) {
        this.orderRepository = orderRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClientService = customerRestClientService;
        this.inventoryRestClientService = inventoryRestClientService;
    }

    @GetMapping("/fullOrder/{id}")
    public Order getOrder (@PathVariable Long id){
        Order  order =  orderRepository.findById(id).orElse(null);
        if (order != null){
            order.setCustomer(customerRestClientService.getCustomerById(order.getCustomerId()));
            order.getProductItems().forEach(pi->{
                pi.setProduct(inventoryRestClientService.getProductById(pi.getProductId()));
            });
        }
        return order;
    }

    // full orders get all orders

    @GetMapping("/allOrders")
    public List<Order> getAllOrders() {
        List<Order> orders = orderRepository.findAll();

        // Enhance each order with customer and product details
        orders.forEach(order -> {
            order.setCustomer(customerRestClientService.getCustomerById(order.getCustomerId()));
            order.getProductItems().forEach(pi -> {
                pi.setProduct(inventoryRestClientService.getProductById(pi.getProductId()));
            });
        });

        return orders;
    }


}
