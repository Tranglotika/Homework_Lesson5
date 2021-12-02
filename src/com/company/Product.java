package com.company;

public class Product {
    public String id;
    public String name;
    public String description;
    public int quantity;
    public int price;
    public String producttype;

    public Product(String id, String name, String description, int quantity, int price, String producttype) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.producttype = producttype;
    }

    public String toString() {
        return "Sản phẩm mã " + id + " tên là " + name + " thuộc loại " + producttype + " có đặc điểm là " + description + ".\nHiện tại đang có " + quantity + " sản phẩm với mức giá là " + price + " VND/1 sản phẩm.";
    }
}
