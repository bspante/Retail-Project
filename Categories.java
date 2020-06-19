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
@Table(name = "categories")
public class Categories {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int Category_ID;
	 
	 @Column(name = "Category_Name")
	 private String Category_Name;
	 
	 @Column(name = "Description")
	 private String Description;

}
