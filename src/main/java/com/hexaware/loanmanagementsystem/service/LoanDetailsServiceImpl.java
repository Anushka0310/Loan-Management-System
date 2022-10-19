package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.repository.LoanDetailsRepository;


@Service
public abstract class LoanDetailsServiceImpl implements LoanDetailsService{

@Autowired
LoanDetailsRepository loandetailsRepo;

@Override
public List<LoanDetails> findAll() {
return loandetailsRepo.findAll();
}

@Override
public LoanDetails findById(Long loan_id) {
return loandetailsRepo.findById(loan_id).get();
}

@Override
public void deleteById(Long loan_id) {
loandetailsRepo.deleteById(loan_id);
}

@Override
public LoanDetails save(LoanDetails loandetails) {
return loandetailsRepo.save(loandetails);
}

@Override
public int update(LoanDetails loandetails, Long loan_id) {
return 0;
}

}
