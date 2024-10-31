package org.alxtek.customerservice;

import org.alxtek.customerservice.entities.Customer;
import org.alxtek.customerservice.repository.CustommerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (CustommerRepository customerRepository ) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Alice")
                    .email("alice@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Bob")
                    .email("bob@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Charlie")
                    .email("charlie@gmail.com")
                    .build());

            customerRepository.findAll().forEach(
                    customer -> {
                        System.out.println("======================");
                        System.out.println(customer.getId());
                        System.out.println(customer.getName());
                        System.out.println(customer.getEmail());
                    });
        };
    }
}