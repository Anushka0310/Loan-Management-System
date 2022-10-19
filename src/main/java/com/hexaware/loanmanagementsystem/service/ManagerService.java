package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFound;


public interface ManagerService {
	
	public List<Manager> findAllManager();
	public Optional<Manager> getManagerById(Long manager_id)throws ResourceNotFound;
	public void deleteById(Long manager_id)throws ResourceNotFound;
	public Manager save(Manager manager);
	public int update(Manager manager,Long manager_id)throws ResourceNotFound;

	
}
