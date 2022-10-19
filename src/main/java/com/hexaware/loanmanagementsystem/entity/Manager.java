package com.hexaware.loanmanagementsystem.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "manager")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="manager_id")
	public Long manager_id;
	
	
	@Column(name="manager_email")
	public String manager_email;
	
	@Column(name="manager_address")
	public String manager_address;
	
	@Column(name="manager_phone")
	public String manager_phone;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="manager_id_fk",referencedColumnName = "manager_id")
	private List<Customer> customerList = new ArrayList<>();
	
	public List<Customer> getStoryList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_email() {
		return manager_email;
	}

	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}

	public String getManager_address() {
		return manager_address;
	}

	public void setManager_address(String manager_address) {
		this.manager_address = manager_address;
	}

	public String getManager_phone() {
		return manager_phone;
	}

	public void setManager_phone(String manager_phone) {
		this.manager_phone = manager_phone;
	}

	public Manager(Long manager_id, String manager_email, String manager_address, String manager_phone) {
		super();
		this.manager_id = manager_id;
		this.manager_email = manager_email;
		this.manager_address = manager_address;
		this.manager_phone = manager_phone;
	}

	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_email=" + manager_email + ", manager_address="
				+ manager_address + ", manager_phone=" + manager_phone + "]";
	}
	
	

}
