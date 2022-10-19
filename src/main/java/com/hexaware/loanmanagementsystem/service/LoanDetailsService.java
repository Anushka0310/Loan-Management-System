package com.hexaware.loanmanagementsystem.service;
import java.util.List;
import com.hexaware.loanmanagementsystem.entity.LoanDetails;

public interface LoanDetailsService {


public List<LoanDetails> findAll();
public LoanDetails findById(Long movieId);
public void deleteById(Long movieId);
public LoanDetails save(LoanDetails loandetails);
public int update(LoanDetails loandetaials,Long loan_id);
}
