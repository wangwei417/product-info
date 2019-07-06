package com.boot.repository;

import com.boot.model.ProductInfo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductInfoRepository extends MongoRepository<ProductInfo,Long>{
    //ProductInfo saveAndFlush(ProductInfo productInfo);
    

}
