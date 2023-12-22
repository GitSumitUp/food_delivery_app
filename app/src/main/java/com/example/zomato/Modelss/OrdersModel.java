package com.example.zomato.Modelss;

public class OrdersModel {
    int orderImage;
    String soldItemName, price, orderNumber;

    public OrdersModel(int orderImage, String soldItemName, String price, String orderNumber){
        this.orderImage = orderImage;
        this.orderNumber = orderNumber;
        this.soldItemName = soldItemName;
        this.price = price;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
