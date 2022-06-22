package com.example.flixbee.baseModule.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@Accessors
public class AttributionRole {

    @EmbeddedId
    private AttributionRoleId attributionRoleId;

    @Column(name = "end_date", columnDefinition = "DATE")
    private LocalDate endDate;


}
