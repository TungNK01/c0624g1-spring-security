package com.codegym.c0624g1springsecurity.repo;

import com.codegym.c0624g1springsecurity.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepo extends JpaRepository<AppRole, Long> {

    AppRole findByName(String name);
}
