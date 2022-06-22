package com.example.flixbee.baseModule.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@Accessors(chain = true)
@Table(name="roles")
public class Role {



    @GeneratedValue
    @Id
    private String id;

    @Column(unique = true)
    private String name;

    @Column(unique = false)
    private String color;


    public Role () {

    }

}
