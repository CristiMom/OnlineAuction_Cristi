package com.sda.onlineAuction.model;

import lombok.Getter;
import lombok.Setter;
import org.thymeleaf.standard.expression.Each;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String firsName;
    private String lastName;
    private String password;
    private UserRole userRole;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "winner", fetch = FetchType.EAGER)
    private List<Product> productsWon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Bid> bidslist;
}
