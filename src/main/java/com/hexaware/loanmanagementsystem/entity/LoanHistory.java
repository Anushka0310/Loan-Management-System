package com.hexaware.loanmanagementsystem.entity;


import javax.persistence.Column;
    import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanHistory {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="loan_id")
public Long loan_id;

@Column(name="customer_id")
public Long customer_id;

@Column(name="loan_history")
public String loan_history;






public  LoanHistory() {
// TODO Auto-generated constructor stub
}




public Long getLoan_id() {
return loan_id;
}




public void setLoan_id(Long loan_id) {
this.loan_id = loan_id;
}




public Long getCustomer_id() {
return customer_id;
}




public void setCustomer_id(Long customer_id) {
this.customer_id = customer_id;
}




public String getLoan_history() {
return loan_history;
}




public void setLoan_history(String loan_history) {
this.loan_history = loan_history;
}




public LoanHistory(Long loan_id, Long customer_id, String loan_history )

       {
super();
this.loan_id = loan_id;
this.customer_id = customer_id;
this.loan_history = loan_history;


}

@Override
public String toString() {
return "LoanDetails [loan_id=" + loan_id + ", customer_id=" + customer_id + ", loan_history="
+ loan_history + "]";}
}
