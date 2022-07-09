package com.cg.ofr.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="landlord")

public class Landlord extends User{

	
	private Integer landlordId;
	
	@Column
	@NotEmpty(message = "Landlord name is required")
	private String landlordName;
	
	@Column
	@NotBlank
	private int landlordAge;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="landlordFlat")
	private List<Flat> flatList=null;
	
	public Landlord() {}
	public Landlord( String landlordName, int landlordAge, List<Flat> flatList) {
		super();
	
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
		this.flatList = flatList;
	}
	public Integer getLandlordId() {
		return landlordId;
	}
	
	public void setLandlordId(Integer landlordId) {
		this.landlordId = landlordId;
	}
	
	public String getLandlordName() {
		return landlordName;
	}
	
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	
	public int getLandlordAge() {
		return landlordAge;
	}
	
	public void setLandlordAge(int landlordAge) {
		this.landlordAge = landlordAge;
	}

	public List<Flat> getFlatList() { 
		  return flatList; 
	} 
	 
	public void setFlatList(List<Flat> flatList) { 
		  this.flatList = flatList;
	}
	
	@Override
	public String toString() {
		return "Landlord [landlordId=" + landlordId + ", landlordName=" + landlordName + ", landlordAge=" + landlordAge
				+ ", flatList=" + flatList + "]";
	}
}
