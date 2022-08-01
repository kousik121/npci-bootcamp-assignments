package com.restemp.demo.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empno")
	private Integer empNo;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="job")
	private String job;
	
	@Column(name="hiredate")
	private Date hireDate;
	
	@Column(name="managerid")
	private Integer managerId;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="commission")
	private Integer commission;
	
	@Column(name="deptno")
	private Integer deptNo;
	
	public Employee() {
		
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", hireDate=" + hireDate
				+ ", managerId=" + managerId + ", salary=" + salary + ", commission=" + commission + ", deptNo="
				+ deptNo + "]";
	}

	public Employee(Integer empNo, String empName, String job, Date hireDate, Integer managerId, Integer salary, Integer commission,
			Integer deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}
	
	
}
