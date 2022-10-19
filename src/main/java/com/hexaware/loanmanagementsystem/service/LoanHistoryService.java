package com.hexaware.loanmanagementsystem.service;
import java.util.List;
import java.util.Optional;


import com.hexaware.loanmanagementsystem.entity.LoanHistory;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


public interface LoanHistoryService {

	public List<LoanHistory> findAllloan_id();
	public Optional<LoanHistory>getLoanById(Long loan_id)throws ResourceNotFoundException;

	public void deleteById(Long loan_id)throws ResourceNotFoundException;;
	public LoanHistory save(LoanHistory loanhistory);
	public int update(LoanHistory loanhistory,Long loan_id)throws ResourceNotFoundException;;
}
