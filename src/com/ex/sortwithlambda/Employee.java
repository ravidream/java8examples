package com.ex.sortwithlambda;

import java.math.BigDecimal;

public class Employee {
	private Integer id;
	private String name;
	private String add;
	private BigDecimal sal;
	
	
	public Employee(Integer id, String name, String add, BigDecimal sal) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.sal = sal;
	}
	
	
	public BigDecimal getSal() {
		return sal;
	}


	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
