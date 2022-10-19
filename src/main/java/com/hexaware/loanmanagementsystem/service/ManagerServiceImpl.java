package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFound;
import com.hexaware.loanmanagementsystem.repository.ManagerRepository;


@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerRepository managerRepo;

	@Override
	public List<Manager> findAllManager() {
		return managerRepo.findAll();
	}

	@Override
	public Optional<Manager> getManagerById(Long manager_id) {
		return null ;
	}

	@Override
	public void deleteById(Long manager_id) {
		managerRepo.deleteById(manager_id);
	}

	@Override
	public Manager save(Manager manager){
		return managerRepo.save(manager);
	}

	@Override
	public int update(Manager manager, Long manager_id) {
		return 0;
	}


}
