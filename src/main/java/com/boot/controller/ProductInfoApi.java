package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.ProductInfo;
import com.boot.repository.ProductInfoRepository;

@RestController
@RequestMapping("api/")
public class ProductInfoApi {

	@Autowired
	private ProductInfoRepository productinfoRepo;

	@RequestMapping(value="productinfo",method=RequestMethod.GET)
	public List<ProductInfo> List()
	{
		return productinfoRepo.findAll();
	}
	
	@RequestMapping(value = "productinfo", method = RequestMethod.POST)
	public ProductInfo create(@RequestBody ProductInfo productinfo) {
		return productinfoRepo.saveAndFlush(productinfo);
	}
	
	@RequestMapping(value = "productinfo/{id}", method=RequestMethod.GET)
	public ProductInfo getById(@PathVariable Long id)
	{
		return productinfoRepo.getOne(id);
	}
}


