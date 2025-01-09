package com.ram.emp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
		
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			@Column(name ="empid")
			private int empid;
			@Column(name ="empName")
			private String empName;
			@Column(name = "email")
			private String email;
			@Column(name ="address")
			private String address;
			@Column(name ="mobile")
			private int mobile;
			@Column(name ="password")
			private String password;
			
			public Employee(int empid, String empName, String email, String address, int number, String password) {
				super();
				this.empid = empid;
				this.empName = empName;
				this.email = email;
				this.address = address;
				this.mobile = number;
				this.password = password;
			}
			public Employee(String empName, String email, String address, int number, String password) {
				super();
				this.empName = empName;
				this.email = email;
				this.address = address;
				this.mobile = number;
				this.password = password;
			}
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
			}
			public String getEmpName() {
				return empName;
			}
			public void setEmpName(String empName) {
				this.empName = empName;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public int getMobile() {
				return mobile;
			}
			public void getMobile(int number) {
				this.mobile = number;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			
}
