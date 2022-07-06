package Test.example.JPAHibernateEntityMappings.repository;

import Test.example.JPAHibernateEntityMappings.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}
