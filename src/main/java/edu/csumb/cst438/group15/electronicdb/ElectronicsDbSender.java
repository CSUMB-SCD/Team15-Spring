package edu.csumb.cst438.group15.electronicdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.group15.electronicdb.entities.ProductInfo;

@Component
public class ElectronicsDbSender implements CommandLineRunner{

    @Autowired
    IProductInfoRepository productInfoRepo;

    @Override
    public void run(String... args) throws Exception {
        ProductInfo pi1 = new ProductInfo(1,10,"MacBook Pro",
        "The newest fastest MacBook out now. It is not only compact, but also more powerful than ever before. It delivers up to 20% more faster performance with the new Intel Core m3, along with i5 and i7 processor. It also has a 10 hour battery life, with a 12 inch retina display and best of all weighs only 2 lbs!", 
        2500, "macbook.png");
        ProductInfo pi2 = new ProductInfo(2,10,"AirPods",
        "Reliable blah blah", 180, "airpods.jpg");
       
        
        //delete db data
        productInfoRepo.deleteAll();

        //add db seeds
        List<ProductInfo> productInfo = Arrays.asList(pi1,pi2);

        productInfoRepo.saveAll(productInfo);
    }

}