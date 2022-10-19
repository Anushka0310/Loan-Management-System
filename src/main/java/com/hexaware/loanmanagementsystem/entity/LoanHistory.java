package com.hexaware.loanmanagementsystem.entity;


	import javax.persistence.Column;
	import java.util.ArrayList;
	import java.util.List;
	import javax.persistence.CascadeType;
	import javax.persistence.FetchType;
    import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name="LoanHistory")
	public class LoanHistory {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		
		@Column(name="loan_history")
		public String loan_history;
		
		
		
		
		

		public  LoanHistory() {
			// TODO Auto-generated constructor stub
		}
		








		public String getLoan_history() {
			return loan_history;
		}




		public void setLoan_history(String loan_history) {
			this.loan_history = loan_history;
		}




public LoanHistory(String loan_history )

       {
			super();
			
			this.loan_history = loan_history;
			
			
		}

		@Override
		public String toString() {
			return "LoanDetails [ loan_history=" + loan_history + "]";}
	}
	


