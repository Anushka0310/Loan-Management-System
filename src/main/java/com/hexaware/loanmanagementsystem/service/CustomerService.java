package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


public interface CustomerService {
	
	public List<Customer> findAllCustomers();
	public Optional <Customer> getCustomerById_customer(Long customer_id)throws ResourceNotFoundException;
	public void deleteById_customer(Long customer_id)throws ResourceNotFoundException;
	public Customer save_customer(Customer customer_id);
	public Customer update_customerById(Customer customer,Long customer_id)throws ResourceNotFoundException;
	

}

