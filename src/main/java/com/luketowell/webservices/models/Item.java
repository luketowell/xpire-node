package com.luketowell.webservices.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="item")
public class Item {

    @Id
    @Column(name="upc")
    private String upc;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="category_id")
    private Long category_id;
    @ManyToOne
    @JoinColumn(name="category_id", nullable=false, insertable = false, updatable = false)
    private ItemCategory category ;

    @Column(name="size")
    private String size;

    @Column(name="img_url")
    private String img_url;

    public Item() {
    }

    public Item(String upc, String name, String description, Long category_id, String size, String img_url) {
        this.upc = upc;
        this.name = name;
        this.description = description;
        this.category_id = category_id;
        this.size = size;
        this.img_url = img_url;
    }

    public Item(String upc, String name, String description, ItemCategory category, String size, String img_url) {
        this.upc = upc;
        this.name = name;
        this.description = description;
        this.category = category;
        this.size = size;
        this.img_url = img_url;
    }
}
