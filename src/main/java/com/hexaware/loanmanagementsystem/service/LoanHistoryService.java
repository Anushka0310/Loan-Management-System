package com.hexaware.loanmanagementsystem.service;
import java.util.List;

import com.hexaware.loanmanagementsystem.entity.LoanHistory;


public interface LoanHistoryService {

    public List<LoanHistory> findAll();
public LoanHistory findById(Long loan_id);
public void deleteById(Long loan_id);
public LoanHistory save(LoanHistory loan_id);
public int update(LoanHistory loanhistory ,Long Loan_id);
}
