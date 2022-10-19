package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.entity.LoanHistory;
import com.hexaware.loanmanagementsystem.repository.LoanHistoryRepository;

import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;
@Service
public abstract class LoanHistoryServiceImpl implements LoanHistoryService{
	
	@Autowired
	LoanHistoryRepository loanhistoryRepo;

	@Override
	public List<LoanHistory> findAllloan_id() {
		return loanhistoryRepo.findAll();
	}

	@Override

	public  Optional<LoanHistory>getLoanById(Long loan_id) throws ResourceNotFoundException {
		return null;
	}

	@Override
	public void deleteById(Long loan_id) throws ResourceNotFoundException{
		loanhistoryRepo.deleteById(loan_id);
	}

	@Override
	public LoanHistory save(LoanHistory loanhistory) {
		return loanhistoryRepo.save(loanhistory);
	}

	@Override
	public int  LoanHistoryupdate(LoanHistory loanhistory, Long loan_id)throws ResourceNotFoundException {
		return 0;
	}

}
