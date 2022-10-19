package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFound;


public interface ManagerService {
	
	public List<Manager> findAllManager();
	public Optional<Manager> getManagerById(Long manager_id)throws ResourceNotFound;
	public void deleteManagerById(Long manager_id)throws ResourceNotFound;
	public Manager savemanager(Manager manager);
	public int managerupdate(Manager manager,Long manager_id)throws ResourceNotFound;

	
}

