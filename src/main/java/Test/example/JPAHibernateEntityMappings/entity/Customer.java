package Test.example.JPAHibernateEntityMappings.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    public Customer(String name)
    {
        this.name=name;
    }

    //One to one mapping
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_item")
    private Item item;


    public Item getItem() {
        return item;
    }
    public void setItem(Item item)
    {
        this.item=item;
    }

    //one to many
    @OneToMany(cascade = CascadeType.ALL,mappedBy="customer")
    @JoinColumn(name="customer_id")
    private List<Item> items=new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    //Many to one
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="customer_id")
    private Customer customer;

    //Many to many
    @ManyToMany(cascade = CascadeType.ALL)
    private  Set<Item> items=new HashSet<>();
    public Set<Item> getItems(){
        return items;
    }
    public void setItems(Set<Item> items)
    {
        this.items=items;
    }

}
