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
        "The newest fastest MacBook out now. It is not only compact, but also more powerful than ever before. It delivers up to 20% more faster performance with the new Intel Core m3, along with an i5 and i7 processor. It also has a 10 hour battery life, with a 12 inch retina display and best of all weighs only 2 lbs!", 
        2500, "macbook.png");
        ProductInfo pi2 = new ProductInfo(2,10,"AirPods",
        "These AirPods change the way you use headphones forever! These instantly turn on and connect to your iPhone, Apple Watch, iPad, or Mac whenever you remove them from the charging case. Any audio also begins to automatically start playing as soon as you put them in your ear and they also pause automatically when you take them out of your ears. You can even To adjust the volume, change the song, make a call, or even get directions by double tapping to activate Siri.", 
        160, "airpods.jpg");
        ProductInfo pi3 = new ProductInfo(3, 10, "MacBook Air", "  ", 2500, "mac-air.jpg");
        
        ProductInfo pi4 = new ProductInfo(4, 10, "iPad Pro", "  ", 2500, "ipad-pro.png");
        ProductInfo pi5 = new ProductInfo(5, 10, "Apple Watch", "  ", 2500, "watch.jpg");
        ProductInfo pi6 = new ProductInfo(6, 10, "4K Apple TV", "  ", 2500, "appletv.jpg");
        ProductInfo pi7 = new ProductInfo(7, 10, "Ryze Tello Edu Drone", "  ", 2500, "drone.jpg");
        ProductInfo pi8 = new ProductInfo(8, 10, "Beats Studio3 Headphones", "  ", 2500, "beats.jpg");

        //delete db data
        productInfoRepo.deleteAll();

        //add db seeds
        List<ProductInfo> productInfo = Arrays.asList(pi1,pi2,pi3,pi4,pi5,pi6,pi7,pi8);

        productInfoRepo.saveAll(productInfo);
    }

}