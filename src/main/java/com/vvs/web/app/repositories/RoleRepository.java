package com.vvs.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.web.app.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
