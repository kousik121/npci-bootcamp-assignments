package com.restemp.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restemp.demo.entity.Employee;

@RepositoryRestResource(path="emp")
@CrossOrigin("http://localhost:4200/")
public interface EmployeeRepsoitory extends JpaRepository<Employee, Long>{
	
}
