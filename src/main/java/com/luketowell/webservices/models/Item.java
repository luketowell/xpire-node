package com.luketowell.webservices.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Item {

    @Id
    private String upc;
    private String name;
    private String description;
    private Date expiry;
    private Integer category_id;
    private String size;
    private String img_url;

    public Item() {
    }

    public Item(String upc, String name, String description, Date expiry, Integer category_id, String size, String img_url) {
        this.upc = upc;
        this.name = name;
        this.description = description;
        this.expiry = expiry;
        this.category_id = category_id;
        this.size = size;
        this.img_url = img_url;
    }
}
