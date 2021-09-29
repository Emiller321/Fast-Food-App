package com.enterprise.fastfoodapplication.dto;

import lombok.Data;

public @Data
class CartOrder {

    public CartOrder(){
    }

    public CartOrder(Food food){
        this.food = food;
        this.foodQuantity = 1;
    }

    public CartOrder(Food food, int foodQuantity) {
        this.food = food;
    }

    private Food food;
    private int foodQuantity;

    public double totalEstimatedCostOfFoodItem () {
        double estimatedTotal = food.getFoodPrice() * foodQuantity;
        return estimatedTotal;
    }

}
