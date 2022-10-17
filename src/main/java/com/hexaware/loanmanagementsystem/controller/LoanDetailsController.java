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

import com.hexaware.loanmanagementsystem.entity.LoanDetails;

import com.hexaware.loanmanagementsystem.service.LoanDetailsService;



@RestController
@RequestMapping("/api")
public class LoanDetailsController {

@Autowired
LoanDetailsService LoanDetailsService;

@GetMapping("/getallloandetails")
public List<LoanDetails> getLoanDetails(){
return LoanDetailsService.findAll();
}

@PostMapping("/addloanhistory")
public String saveMovie(@RequestBody LoanDetails loandetails) {
return LoanDetailsService.save(loandetails) + "added successfully";
}

@DeleteMapping("/deleteloanhistory/{loan_id}")
public void deleteLoanDetails(@PathVariable("loan_id") Long loan_id) {
LoanDetailsService.deleteById(loan_id) ;
}

@GetMapping("/getloandetails/{loan_id}")
public LoanDetails getLoanDetails(@PathVariable("loan_id") Long loan_id) {
return LoanDetailsService.findById(loan_id);
}

@PutMapping("/updateloandetails(loan_id}")
public String Update(@RequestBody LoanDetails loandetails,@PathVariable("loan_id") Long loan_id) {
return LoanDetailsService.update(loandetails, loan_id) + " updated successfully";
}
}
