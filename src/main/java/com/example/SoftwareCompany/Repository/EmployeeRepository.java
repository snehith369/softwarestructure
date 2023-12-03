package com.example.SoftwareCompany.Repository;

import com.example.SoftwareCompany.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}