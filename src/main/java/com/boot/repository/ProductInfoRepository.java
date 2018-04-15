package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,Long>{

}
