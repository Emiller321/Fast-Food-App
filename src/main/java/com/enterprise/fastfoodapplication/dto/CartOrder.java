package com.enterprise.fastfoodapplication.dto;

import lombok.Data;

public @Data
class CartOrder {

    public CartOrder(){
    }

    public CartOrder(Food food){
        this.food = food;
        this.foodPrice = food.getFoodPrice();
        this.foodQuantity = 1;
    }

    private Food food;
    private double foodPrice;
    private int foodQuantity;

}
