package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.LoanHistory;
import com.hexaware.loanmanagementsystem.repository.LoanHistoryRepository;


@Service
public abstract class LoanHistoryServiceImpl implements LoanHistoryService{

@Autowired
LoanHistoryRepository loanhistoryRepo;

@Override
public List<LoanHistory> findAll() {
return loanhistoryRepo.findAll();
}

@Override
public LoanHistory findById(Long loan_id) {
return loanhistoryRepo.findById(loan_id).get();
}

@Override
public void deleteById(Long loan_id) {
loanhistoryRepo.deleteById(loan_id);
}

@Override
public LoanHistory save(LoanHistory loanhistory) {
return loanhistoryRepo.save(loanhistory);
}

@Override
public int update(LoanHistory loanhistory, Long loan_id) {
return 0;
}

}
