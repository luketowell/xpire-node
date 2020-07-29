package com.asda.xpire.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Item implements Serializable {
    private @Id long id;
    private String name;
    private String productUPC;
    private String description;

    public Item (String name, String productUPC, String description){
        this.name = name;
        this.productUPC = productUPC;
        this.description = description;
    }
}
