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
@Table(name = "products")
public class Products {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int PRODUCT_ID;
	 
	 @Column(name = "SUPPLIER_ID")
	 private int SUPPLIER_ID;
	 
	 @Column(name = "CATEGORY_ID")
	 private int CATEGORY_ID; 
	 
	 @Column(name = "Product_Name")
	 private String Product_Name;
	 
	 @Column(name = "Unit_Price")
	 private double Unit_Price;
	 
	 @Column(name = "Quantity_per_Unit")
	 private int Quantity_per_Unit;
	 
	 @Column(name = "Units_in_Stock")
	 private int Units_in_Stock;
	 
	 @Column(name = "Discount_Percent")
	 private int Discount_Percent;
	 
	 @Column(name = "Product_Status")
	 private int Product_Status;

	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public int getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}

	public void setSUPPLIER_ID(int sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}

	public int getCATEGORY_ID() {
		return CATEGORY_ID;
	}

	public void setCATEGORY_ID(int cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public double getUnit_Price() {
		return Unit_Price;
	}

	public void setUnit_Price(double unit_Price) {
		Unit_Price = unit_Price;
	}

	public int getQuantity_per_Unit() {
		return Quantity_per_Unit;
	}

	public void setQuantity_per_Unit(int quantity_per_Unit) {
		Quantity_per_Unit = quantity_per_Unit;
	}

	public int getUnits_in_Stock() {
		return Units_in_Stock;
	}

	public void setUnits_in_Stock(int units_in_Stock) {
		Units_in_Stock = units_in_Stock;
	}

	public int getDiscount_Percent() {
		return Discount_Percent;
	}

	public void setDiscount_Percent(int discount_Percent) {
		Discount_Percent = discount_Percent;
	}

	public int getProduct_Status() {
		return Product_Status;
	}

	public void setProduct_Status(int product_Status) {
		Product_Status = product_Status;
	}
	 
	 
	

}
