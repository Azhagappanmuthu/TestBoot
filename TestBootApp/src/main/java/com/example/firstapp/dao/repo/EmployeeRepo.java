package com.example.firstapp.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstapp.dao.model.Employee;

/**
 * Repository used to access the employee table
 * @author Karthick
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	 
	Employee findByEmpId(Integer empId);

}
