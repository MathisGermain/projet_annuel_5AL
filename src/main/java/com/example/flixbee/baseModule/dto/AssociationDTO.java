package com.example.flixbee.baseModule.dto;


import lombok.Data;
import com.example.flixbee.baseModule.domain.User;

@Data
public class AssociationDTO {


    private String id;
    private String email;
    private User user_owner;
    private String description;
    private String siren;
}
