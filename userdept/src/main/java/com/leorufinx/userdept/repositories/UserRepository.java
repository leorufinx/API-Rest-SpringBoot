package com.leorufinx.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leorufinx.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
