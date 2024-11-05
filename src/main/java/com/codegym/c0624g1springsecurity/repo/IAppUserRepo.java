package com.codegym.c0624g1springsecurity.repo;

import com.codegym.c0624g1springsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
