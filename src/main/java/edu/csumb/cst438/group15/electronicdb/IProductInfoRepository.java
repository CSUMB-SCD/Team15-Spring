package edu.csumb.cst438.group15.electronicdb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.group15.electronicdb.entities.ProductInfo;

@Repository
public interface IProductInfoRepository extends MongoRepository<ProductInfo, String>{
    @Query("{ 'productName': ?0}")
    List<ProductInfo> getProductInfoByName(@Param("name") String name);

}