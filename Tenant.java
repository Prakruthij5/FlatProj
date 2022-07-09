package com.cg.ofr.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
@Entity
public class Tenant extends User {
	
	private int tenant_id;
	
	@Column(name="age")
	@NotBlank
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="tenantFlat")
	private Flat flat;
	
	
	public Tenant() {}
	public Tenant( int age, Flat flat) {
		super();
		
		this.age = age;
		this.flat = flat;
	}


	public int getTenant_id() {
		return tenant_id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Flat getFlat() {
		return flat;
	}


	public void setFlat(Flat flat) {
		this.flat = flat;
	}


	@Override
	public String toString() {
		return "Tenant [tenant_id=" + tenant_id + ", age=" + age + ", flat=" + flat + "]";
	}

}
