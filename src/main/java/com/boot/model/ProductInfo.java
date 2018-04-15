package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	
	public ProductInfo(long _id, String _name)
	{
		this.id = _id;
		this.name = _name;
	}
	
	public ProductInfo(String name)
	{
		this.name = name;
	}
}
