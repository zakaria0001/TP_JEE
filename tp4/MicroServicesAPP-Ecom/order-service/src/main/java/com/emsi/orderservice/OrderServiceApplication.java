package com.emsi.orderservice;

import com.emsi.orderservice.entities.Order;
import com.emsi.orderservice.entities.ProductItem;
import com.emsi.orderservice.enums.OrderStatus;
import com.emsi.orderservice.model.Customer;
import com.emsi.orderservice.model.Product;
import com.emsi.orderservice.repositories.OrderRepository;
import com.emsi.orderservice.repositories.ProductItemRepository;
import com.emsi.orderservice.services.CustomerRestClientService;
import com.emsi.orderservice.services.InventoryRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(OrderRepository orderRepository,
							ProductItemRepository productItemRepository,
							InventoryRestClientService inventoryRestClientService,
							CustomerRestClientService customerRestClientService
							) {
		return args -> {

			List<Customer> customers = customerRestClientService.allCustomers().getContent().stream().toList()	;
			List< Product> products = inventoryRestClientService.allProducts().getContent().stream().toList();
			Long customerId = 1L;
			Customer customer = customerRestClientService.getCustomerById(customerId);
			Random random = new Random();
			for (int i = 0; i < 10; i++) {
				Order order =Order.builder()
						.customerId(customers.get(random.nextInt(customers.size())).getId())
						.orderStatus(Math.random() > 0.5 ? OrderStatus.PENDING : OrderStatus.CREATED)
						.createdAt(new Date())
						.build();
				Order savedOrder = orderRepository.save(order);
				for (int j = 0; j < 3; j++) {

					if (Math.random() > 0.70) {
						ProductItem productItem = ProductItem.builder()
								.order(savedOrder)
								.productId(products.get(j).getId())
								.price(products.get(j).getPrice())
								.quantity(1+random.nextInt(10))
								.discount(Math.random())
								.build();
						productItemRepository.save(productItem);
					}

				}
			}
		};
	}

}