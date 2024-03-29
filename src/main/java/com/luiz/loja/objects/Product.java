package com.luiz.loja.objects;

import com.luiz.loja.dtos.ProductRequestDTO;
import jakarta.persistence.*;

@Table(name="products")
@Entity(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageurl;
    private double price;

    public Product() {

    }
    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.description = data.description();
        this.price = data.price();
        this.imageurl = data.imageurl();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
