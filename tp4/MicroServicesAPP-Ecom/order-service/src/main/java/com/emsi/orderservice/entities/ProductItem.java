package com.emsi.orderservice.entities;


import com.emsi.orderservice.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id;
    private Long productId;
    @Transient
    private Product product;

    private double price;
    private double quantity;

    private double discount;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;


}
