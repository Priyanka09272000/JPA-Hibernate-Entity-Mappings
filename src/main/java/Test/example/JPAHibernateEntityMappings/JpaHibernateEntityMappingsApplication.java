package Test.example.JPAHibernateEntityMappings;

import Test.example.JPAHibernateEntityMappings.entity.Customer;
import Test.example.JPAHibernateEntityMappings.entity.Item;
import Test.example.JPAHibernateEntityMappings.repository.CustomerRepository;
import Test.example.JPAHibernateEntityMappings.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateEntityMappingsApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateEntityMappingsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Customer customer=new Customer("Tom");
		Item item1 = new Item("Item1");
		Item item2 = new Item("Item2");

		//customer.getItems().add(item1);
		//customer.getItems().add(item2);

		item1.setCustomer(customer);
		item2.setCustomer(customer);
		//customer.setItem(item1);
		customerRepository.save(customer);
	}
}
