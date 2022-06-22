package com.example.flixbee;


import com.example.flixbee.baseModule.repository.AssociationRepository;
import com.example.flixbee.baseModule.repository.RoleRepository;
import com.example.flixbee.baseModule.repository.UserRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BootstrapAccounts {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final AssociationRepository associationRepository;

    public BootstrapAccounts(UserRepository userRepository, RoleRepository roleRepository, AssociationRepository associationRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.associationRepository = associationRepository;
    }

    @EventListener
    void onStartup(ApplicationReadyEvent event) {}
}
