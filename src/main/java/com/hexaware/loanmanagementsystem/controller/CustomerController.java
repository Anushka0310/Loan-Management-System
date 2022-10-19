package com.hexaware.loanmanagementsystem.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.service.CustomerService;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


@RestController
@RequestMapping("/customerapi")

public class CustomerController {
	@Autowired
	CustomerService customerservice ;
	
	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers(){
		return customerservice.findAllCustomers();
		}
	@PostMapping("/savecustomers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerservice.save_customer(customer) ;
	}
	
	@DeleteMapping("/deletecustomer/{customer_id}")
	public void deleteCustomer(@PathVariable("customer_id") Long customer_id) throws ResourceNotFoundException{
		 customerservice.deleteById_customer(customer_id) ;
	}
	
	@GetMapping("/getcustomer/{customer_id}")
	public  Optional <Customer> getCustomerById_customer(@PathVariable("customer_id") Long customerId) throws ResourceNotFoundException{
		return customerservice.getCustomerById_customer(customerId);
	}
	
	@PutMapping("/updatecustomer/{customer_id}")
	public Customer update_customerById(@RequestBody Customer customer,@PathVariable("customer_id") Long customer_id)throws ResourceNotFoundException {
		return customerservice.update_customerById(customer, customer_id);
	}

}
