package org.alxtek.inventoryservice;

import org.alxtek.inventoryservice.entities.Product;
import org.alxtek.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            {
                productRepository.save(Product.builder()
                        .id(UUID.randomUUID().toString())
                        .price(100)
                        .name("Laptop")
                        .quantity(10)
                        .build());
                productRepository.save(Product.builder()
                        .id(UUID.randomUUID().toString())
                        .price(200)
                        .name("Mouse")
                        .quantity(20)
                        .build());
                productRepository.save(Product.builder()
                        .id(UUID.randomUUID().toString())
                        .price(300)
                        .name("Keyboard")
                        .quantity(30)
                        .build());
                productRepository.save(Product.builder()
                        .id(UUID.randomUUID().toString())
                        .price(400)
                        .name("Monitor")
                        .quantity(40)
                        .build());

                productRepository.findAll().forEach(
                        product -> {
                            System.out.println("===================");
                            System.out.println(product.toString());
                        }
                );
            }
        };
    }

}
