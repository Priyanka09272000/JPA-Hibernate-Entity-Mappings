package Test.example.JPAHibernateEntityMappings.entity;

import javax.persistence.*;


@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Item(String name)
    {
        this.name=name;
    }
    //@OneToOne(cascade = CascadeType.ALL,mappedBy = "item")
    //private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
