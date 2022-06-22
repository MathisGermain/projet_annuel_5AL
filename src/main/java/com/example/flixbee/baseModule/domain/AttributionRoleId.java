package com.example.flixbee.baseModule.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@Accessors
public class AttributionRoleId implements Serializable {

    private String user_id;
    private String role_id;
}
