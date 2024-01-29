package com.emsi.customarservice;

import com.emsi.customarservice.entities.Customer;
import com.emsi.customarservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;
@EnableDiscoveryClient
@SpringBootApplication
public class CustomarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomarServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository , RepositoryRestConfiguration restConfiguration) {
        return args -> {


            restConfiguration.exposeIdsFor(Customer.class); // expose id for customer class
            customerRepository.saveAll(List.of(
                    Customer.builder().name("Hassan").email("hassan@gmail.com").build(),
                    Customer.builder().name("Mohamed").email("Mohhammed@gmail.com").build(),
                    Customer.builder().name("Ali").email("Ali@gmail.com").build()
            )
            );

            customerRepository.findAll().forEach(System.out::println);

        };
    }
}
