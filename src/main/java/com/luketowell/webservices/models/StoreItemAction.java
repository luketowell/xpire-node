package com.luketowell.webservices.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="store_item_action")
public class StoreItemAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="action_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="store_item_id", nullable=false)
    private StoreItem store_item;

    private String user_id;

    private Long status_id;

    private Long expired_count;
    private Date update_date;

    public StoreItemAction() {
    }

}
