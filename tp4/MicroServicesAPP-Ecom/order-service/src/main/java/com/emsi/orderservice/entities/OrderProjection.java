package com.emsi.orderservice.entities;

import com.emsi.orderservice.enums.OrderStatus;
import com.emsi.orderservice.model.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "fullOrder", types = Order.class)
public interface OrderProjection {

     Long getId();
     String getCreatedAt();
     Long getCustomerId();

     Customer getCustomer();

     List<ProductItem> getProductItems();

     OrderStatus getStatus();



}
