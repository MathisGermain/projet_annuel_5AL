package com.example.flixbee.baseModule.repository;

import com.example.flixbee.baseModule.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User, String> {
}
