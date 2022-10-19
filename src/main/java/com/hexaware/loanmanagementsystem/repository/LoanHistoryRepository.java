package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.hexaware.loanmanagementsystem.entity.LoanHistory;
@Repository
public interface LoanHistoryRepository extends JpaRepository<LoanHistory,Long> {

}
