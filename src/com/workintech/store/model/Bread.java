package com.workintech.store.model;

public class Bread extends ProductForSale{
    private String floorType;
    private String color;
    public Bread(String type, double price, String description, String floorType, String color ) {
        super(type, price, description);
        this.floorType = floorType;
        this.color = color;
    }

    @Override
    public void showDetails() {

    }
}
