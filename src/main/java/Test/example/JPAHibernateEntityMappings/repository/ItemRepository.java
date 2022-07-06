package Test.example.JPAHibernateEntityMappings.repository;

import Test.example.JPAHibernateEntityMappings.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemRepository extends JpaRepository<Item,Integer>{
}
