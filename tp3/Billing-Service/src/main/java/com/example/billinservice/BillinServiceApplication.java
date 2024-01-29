package com.example.billinservice;

import com.example.billinservice.entities.Bill;
import com.example.billinservice.entities.ProductItem;
import com.example.billinservice.models.Customer;
import com.example.billinservice.models.Product;
import com.example.billinservice.repositories.BillRepository;
import com.example.billinservice.repositories.ProductItemRepository;
import com.example.billinservice.service.CustomarRestClient;
import com.example.billinservice.service.ProductRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@EnableFeignClients
@SpringBootApplication
public class BillinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillinServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository, CustomarRestClient customarRestClient, ProductRestClient productRestClient) {

		return args -> {
			Collection<Product> products = productRestClient.AllProducts().getContent();
			Long customerID = 1L;
			Customer customer = customarRestClient.findCustomerById(customerID);
			Bill bill = new Bill();
			bill.setBillDate(new Date());

			if (customer == null){
				throw new RuntimeException("Customer not found");
			}

			bill.setCustomerId(customer.getId());
			Bill savedBill =  billRepository.save(bill);

			products.forEach(product -> {
				ProductItem productItem = new ProductItem();
				productItem.setPrice(product.getPrice());
				productItem.setQuantity(1 + (int)(Math.random() * 10));
				productItem.setDiscount(Math.random() * 10);
				productItem.setBill(savedBill);
				productItem.setProductId(product.getId());
				productItemRepository.save(productItem);
			});
		};
	}

}
