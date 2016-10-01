package com.imooc.hibernate.entity;

import java.util.HashSet;
import java.util.Set;
/*
 * 员工持久化类
 */
public class Employee {	
	private int empid;
	private String empname;
	//添加一个项目集合
	private Set<Project> projects = new HashSet<Project>();
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	
	public Employee(int empid, String empname, Set<Project> projects) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.projects = projects;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	
}
