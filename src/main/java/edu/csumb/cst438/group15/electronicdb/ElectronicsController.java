package edu.csumb.cst438.group15.electronicdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import edu.csumb.cst438.group15.electronicdb.entities.ProductInfo;


@RestController
public class ElectronicsController {
    @Autowired
    IProductInfoRepository productInfoRepository;

    @CrossOrigin(origins = "*") 
    @RequestMapping("/allProductInfo")
    public List<ProductInfo> getAllProductInfo () {
        List<ProductInfo> result = productInfoRepository.findAll();
        return result;
    }

    @CrossOrigin(origins = "*") 
    @RequestMapping("/search")
    public List<ProductInfo> searchProductInfoByName (@RequestParam("product-name") String productName) {
        return productInfoRepository.getProductInfoByName(productName);
    }

}
