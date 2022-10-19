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

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFound;
import com.hexaware.loanmanagementsystem.service.ManagerService;



@RestController
@RequestMapping("/api")


public class ManagerController {
	@Autowired
	ManagerService managerService;
	
	@GetMapping("/getallmanager")
	public List<Manager> getAllManager(){
		return managerService.findAllManager();
	}
	
	@PostMapping("/addmanager")
	public String saveManager(@RequestBody Manager manager) {
		return managerService.savemanager(manager) + "Manager added Successfully";
	}
	
	@DeleteMapping("/deletemanager/{manager_id}")
	public void deleteManager(@PathVariable("manager_id") Long manager_id) throws ResourceNotFound {
		managerService.deleteManagerById(manager_id) ;
	}
	
	@GetMapping("/getmanager/{manager_id}")
	public Optional<Manager> getManager(@PathVariable("manager_id") Long manager_id) throws ResourceNotFound {
		return managerService.getManagerById(manager_id);
	}
	
	@PutMapping("/updatemanager/{manager_id}")
	public String Update(@RequestBody Manager manager,@PathVariable("manager_id") Long manager_id) throws ResourceNotFound {
		return managerService.managerupdate(manager, manager_id) + " Manager updated successfully";
	}

}
