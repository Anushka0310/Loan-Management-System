package com.hexaware.loanmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.entity.LoanHistory;

import com.hexaware.loanmanagementsystem.service.LoanHistoryService;



@RestController
@RequestMapping("/api")
public class LoanHistoryController {

@Autowired
LoanHistoryService LoanHistoryService;

@GetMapping("/getallloanhistory")
public List<LoanHistory> getLoanHistory(){
return LoanHistoryService.findAll();
}

@PostMapping("/addloanhistory")
public String saveMovie(@RequestBody LoanHistory loanhistory) {
return LoanHistoryService.save(loanhistory) + "added successfully";
}

@DeleteMapping("/deleteloanhistory/{loan_id}")
public void deleteLoanHistory(@PathVariable("loan_id") Long loan_id) {
LoanHistoryService.deleteById(loan_id) ;
}

@GetMapping("/getloanhistory/{loan_id}")
public LoanHistory getLoanHistory(@PathVariable("loan_id") Long loan_id) {
return LoanHistoryService.findById(loan_id);
}

@PutMapping("/updateloanhistory(loan_id}")
public String Update(@RequestBody LoanHistory loanhistory,@PathVariable("loan_id") Long loan_id) {
return LoanHistoryService.update(loanhistory, loan_id) + " updated successfully";

}

