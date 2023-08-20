package com.example.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.employee.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Long >{
//all crud database methods
}
