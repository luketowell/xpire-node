package com.luketowell.webservices.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "store_item")
public class StoreItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="item_upc", updatable = false, insertable = false)
    private Long item_upc;

    @Column(name="store_id")
    private String storeId;

    @Column(name="expiry_date")
    private Date expiry_date;

    @Column(name="created_date")
    private Date created_date;

    @Column(name="updated_date")
    private Date updated_date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="item_upc")
    private Item item;

    @OneToMany(mappedBy = "store_item_id")
    private Set<StoreItemAction> actions;

    public StoreItem() {
    }

    public StoreItem(Long id, Long item_upc, String storeId, Date expiry_date, Date created_date, Date updated_date) {
        this.id = id;
        this.item_upc = item_upc;
        this.storeId = storeId;
        this.expiry_date = expiry_date;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }

    public StoreItem(Long id, String storeId, Date expiry_date, Date created_date, Date updated_date, Item item) {
        this.id = id;
        this.storeId = storeId;
        this.expiry_date = expiry_date;
        this.created_date = created_date;
        this.updated_date = updated_date;
        this.item = item;
    }
}
