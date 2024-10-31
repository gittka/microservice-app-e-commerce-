package org.alxtek.customerservice.repository;

import org.alxtek.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustommerRepository extends JpaRepository<Customer, Long> {
}
