package elhanchir.mohamed.ebanking.repositories;

import elhanchir.mohamed.ebanking.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer countCustomerByEmail(String email);
}
