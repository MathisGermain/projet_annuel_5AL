package com.example.flixbee.baseModule.domain;

import lombok.Data;
import lombok.experimental.Accessors;


import javax.persistence.*;

@Entity
@Data
@Accessors
@Table(name="users")
public class User {

    @GeneratedValue
    @Id
    private String id;

    @Column(unique = true)
    private String email;

    @Column(unique = false)
    private String name;

    @Column(unique = false)
    private String firstname;

    @Column(unique = false)
    private String password;


}
