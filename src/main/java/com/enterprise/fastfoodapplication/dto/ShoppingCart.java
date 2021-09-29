package com.enterprise.fastfoodapplication.dto;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private String shoppingId;
    private Map<String, CartOrder> orders;

    public   ShoppingCart() {
        orders = new HashMap<String, CartOrder>();
    }

    public ShoppingCart(String shoppingId) {
        this.shoppingId = shoppingId;
        orders = new HashMap<String, CartOrder>();
    }

    public double totalEstimatedCost() {
        double estimatedTotal = 0;
        for (CartOrder order : orders.values()) {
            estimatedTotal += order.getFood().getFoodPrice();
        }
        return estimatedTotal;
    }


}
