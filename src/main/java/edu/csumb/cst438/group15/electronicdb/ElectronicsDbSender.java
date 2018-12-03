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
        2500, "macbook.jpg", "macbook2.jpg", "macbook3.jpg");
        ProductInfo pi2 = new ProductInfo(2,10,"AirPods",
        "These AirPods change the way you use headphones forever! These instantly turn on and connect to your iPhone, Apple Watch, iPad, or Mac whenever you remove them from the charging case. Any audio also begins to automatically start playing as soon as you put them in your ear and they also pause automatically when you take them out of your ears. You can even To adjust the volume, change the song, make a call, or even get directions by double tapping to activate Siri.", 
        160, "airpods.jpg", "airpods2.jpg", "airpods3.jpg");
        ProductInfo pi3 = new ProductInfo(3, 10, "MacBook Air", "The thinnest and lightest MacBook of them all, is now even thinner. It now features a brilliant Retina display, Touch ID, the latest-generation keyboard, and a Force Touch trackpad. The iconic wedge is created from 100 percent recycled aluminum, making it the greenest Mac ever. And with all-day battery life, MacBook Air is your perfectly portable, do-it-all notebook.", 
        2500, "mac-air.jpg", "mac-air2.jpg", "mac-air3.jpg");
        ProductInfo pi4 = new ProductInfo(4, 10, "iPad Pro", "The iPad Pro is now newly redesigned! It’s all new, all screen, and all powerful. It’s all new, all screen, and all powerful. Completely redesigned and packed with our most advanced technology, it will make you rethink what iPad is capable of. And what a computer is capable of. The new Liquid Retina display goes from edge to edge. True-to-life color and ProMotion technology make everything look gorgeous and feel responsive. You’ve got to see it — and touch it — to believe it.", 
        800, "ipad-pro.jpg", "ipad-pro2.jpg", "ipad-pro3.jpg");
        ProductInfo pi5 = new ProductInfo(5, 10, "Apple Watch", "This is part of the Watch Series 3. You can stay active, healthy, and connected all at the same time with this watch. You can Monitor your health. Track your workouts. Get the motivation you need to achieve your fitness goals. And stay connected to the people and information you care about. With Apple Watch Series 3, you can do it all — right from your wrist. ", 
        410, "watch.jpg", "watch2.jpg", "watch3.jpg");
        ProductInfo pi6 = new ProductInfo(6, 10, "4K Apple TV", " Apple TV 4K lets you watch movies and shows in amazing 4K HDR — and now it completes the picture with immersive sound from Dolby Atmos. It streams your favorite channels live. Has great content from apps like Netflix, Amazon Prime Video, and ESPN.2 And thanks to Siri, you can control it all with just your voice. 4K gives you a crisper picture using four times more pixels than standard HD. High Dynamic Range (HDR) delivers brighter, more realistic colors and greater detail.", 
        199, "appletv.jpg", "appletv2.jpg", "appletv3.jpg");
        ProductInfo pi7 = new ProductInfo(7, 10, "Ryze Tello Edu Drone", " Ryze's Tello Edu drone is an ideal companion for anyone engaged in STEAM-based learning. The drone provides precise and stable flying thanks to DJI’s cutting-edge flight technology. And the Tello Edu app together with Swift Playgrounds help you learn to write code to program the drone. The Tello Edu app has a colorful interface complete with educational features and visual programming. It pairs with your iPhone or iPad to offer complete control of Tello Edu while simplifying its maneuvers.", 
        130, "drone.jpg", "drone2.jpg", "drone3.jpg");
        ProductInfo pi8 = new ProductInfo(8, 10, "Beats Studio3 Headphones", "Take off. Beats Studio3 Wireless – Skyline Collection features four luxury colors to elevate every step of your journeys: Midnight Black, Crystal Blue, Desert Sand, and Shadow Gray. Explore the world in style and enjoy a premium listening experience with Pure Adaptive Noise Canceling (Pure ANC), which blocks external noise and preserves the full clarity, range, and emotion of your sound. Up to 22 hours of battery life lets you enjoy nonstop music in comfort even on long flights.", 
        350, "beats.jpg", "beats2.jpg", "beats3.jpg");

        //delete db data
        productInfoRepo.deleteAll();

        //add db seeds
        List<ProductInfo> productInfo = Arrays.asList(pi1,pi2,pi3,pi4,pi5,pi6,pi7,pi8);

        productInfoRepo.saveAll(productInfo);
    }

}