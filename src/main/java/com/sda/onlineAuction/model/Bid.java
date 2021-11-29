package com.sda.onlineAuction.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    private Integer value;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
