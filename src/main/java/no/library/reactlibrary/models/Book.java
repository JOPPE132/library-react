package no.library.reactlibrary.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto-increment ID in DB
    private int bid;

    @Column (name = "name", nullable = false, length = 512)
    private String name;

    @Column (name = "price", nullable = false)
    private int price;

    @Column (name = "publisher", nullable = false)
    private String publisher;

    @JsonIgnore //Trenger jeg denne?
    @ManyToMany(mappedBy = "books") //name of set in Author.java
    private Set<Author> authors = new HashSet<>();

    public Book(String name, int price, String publisher){
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(){
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
