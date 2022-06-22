package com.example.flixbee.baseModule.service;

import com.example.flixbee.baseModule.repository.AssociationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class AssociationService {

    @Autowired
    private AssociationRepository associationRepository;
}
