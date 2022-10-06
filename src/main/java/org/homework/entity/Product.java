package org.homework.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(length = 128,unique = true,nullable = false)
    private Long product_id;*/
    @Column(length = 128,unique = true,nullable = false)
    private String title;

    @Column(length = 128,unique = true,nullable = false)
    private int price;


    /*public Product(*//*Long product_id,*//* String title, int price) {
        *//*this.product_id = product_id;*//*
        this.title = title;
        this.price = price;
    }
*/
    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
