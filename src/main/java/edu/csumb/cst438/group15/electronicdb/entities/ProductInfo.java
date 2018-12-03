package edu.csumb.cst438.group15.electronicdb.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductInfo")
public class ProductInfo {
    
    private Number id;
    private Integer quantity;
    private String description;
    private Integer price;
    private String productName;
    private String image;
    private String image2;
    private String image3;


    public ProductInfo (Number id, Integer quantity, String productName, String description, Integer price, String image, String image2, String image3) {
        this.id = id;
        this.quantity = quantity;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Number getID(){
        return this.id;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductDesc() {
        return this.description;
    }

    public Integer getPrice(){
        return this.price;
    }

    public String getImage() {
        return this.image;
    }

    public String getImage2() {
        return this.image2;
    }

    public String getImage3() {
        return this.image3;
    }
}