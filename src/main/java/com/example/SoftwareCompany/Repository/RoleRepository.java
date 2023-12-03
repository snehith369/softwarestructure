package com.example.SoftwareCompany.Repository;

import com.example.SoftwareCompany.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
}