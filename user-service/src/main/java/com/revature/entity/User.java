package com.revature.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "resetToken")
	private String resetToken;
	
//	columnDefinition forces the role to be either MANAGER, CUSTOMER, or VENDOR
	@Column(name="role", columnDefinition = "VARCHAR2(50) CHECK (role IN ('ADMIN', 'QC', 'USER'))")
	private String role;
	
	
public User() { }
	
	
	
	
}
