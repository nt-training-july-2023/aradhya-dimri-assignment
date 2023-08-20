package com.example.employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee.entity.Employee;
import com.example.employee.exception.ResourceNotFoundException;
import com.example.employee.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeerepo;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return this.employeerepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable(value="id")long id) {
	return this.employeerepo.findById(id)
			.orElseThrow(()->new ResourceNotFoundException("Employee Not Found:"+id));
	}
	
	//for create a user
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
	return this.employeerepo.save(employee);
}
	
	
	//for updating
	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") long id) {
	    Employee em = this.employeerepo.findById(id)
	         .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found:"+id));

	    em.setName(employee.getName());
	    em.setEmail(employee.getEmail());
	    em.setNumber(employee.getNumber());
	    em.setAddress(employee.getAddress());

	    return this.employeerepo.save(em);
	}

	//for deleting for user
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable long id){
		Employee em=this.employeerepo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee Not Found:"+id));
		this.employeerepo.delete(em);
		return ResponseEntity.ok().build(); 
		
	}
}

