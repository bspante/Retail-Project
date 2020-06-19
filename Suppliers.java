package com.example.retailstore.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Suppliers {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int Supplier_ID;
	 
	 @Column(name = "Company_Name")
	 private String Company_Name;
	 
	 @Column(name = "Contact_Name")
	 private String Contact_Name; 
	 
	 @Column(name = "Contact_Designation")
	 private String Contact_Designation;
	 
	 @Column(name = "Phone_Number")
	 private int Phone_Number;
	 
	 @Column(name = "Address")
	 private String Address;
	 
	 @Column(name = "City")
	 private String City;
	 
	 @Column(name = "Zip_Code")
	 private int Zip_Code;
	 
	 @Column(name = "Country")
	 private String Country;

	public int getSupplier_ID() {
		return Supplier_ID;
	}

	public void setSupplier_ID(int supplier_ID) {
		Supplier_ID = supplier_ID;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public String getContact_Name() {
		return Contact_Name;
	}

	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}

	public String getContact_Designation() {
		return Contact_Designation;
	}

	public void setContact_Designation(String contact_Designation) {
		Contact_Designation = contact_Designation;
	}

	public int getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getZip_Code() {
		return Zip_Code;
	}

	public void setZip_Code(int zip_Code) {
		Zip_Code = zip_Code;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	 
	 

}
