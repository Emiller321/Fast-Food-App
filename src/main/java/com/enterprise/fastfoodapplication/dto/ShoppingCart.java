package com.enterprise.fastfoodapplication.dto;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    /** We might not need this to be honest, I can't think of adding this to our database
     * and don't see a reason as to why we'd need this id honestly
     */
    private String shoppingId;
    private Map<String, CartOrder> orders; //We can probably use foodId as key in this Map object

    public ShoppingCart() {
        orders = new HashMap<String, CartOrder>();
    }

    public ShoppingCart(String shoppingId) {
        this.shoppingId = shoppingId;
        orders = new HashMap<String, CartOrder>();
    }

    public double totalEstimatedCostOfEntireCart()
    {
        double estimatedTotal = 0;
        for (CartOrder order : orders.values()) {
            estimatedTotal += order.getFood().getFoodPrice()*order.getFoodQuantity();
        }
        return estimatedTotal;
    }

    /**
     * Returns details of a order for a given cart based on its foodId
     * @param foodId a unique identifier to represent a Food object
     * @return a CartOrder object which contains food details and its quantity for this cart
     */
    public CartOrder getOrderDetailsInCart(String foodId) {
        //TO DO Implementation
        return null;
    }

    /**
     * To add or update an order to your cart. If the food item exists, then update quantity. Otherwise, add
     * a new order in the orders HashMap
     * @param order takes a CartOrder object containing food information and its quantity
     */
    public void addOrUpdateOrderToCart(CartOrder order) {
        String cartOrderFoodId=order.getFood().getFoodId();
        if(orders.containsKey(cartOrderFoodId)){
            CartOrder currentOrder=orders.get(cartOrderFoodId);
            currentOrder.setFoodQuantity(currentOrder.getFoodQuantity()+order.getFoodQuantity());
            orders.put(cartOrderFoodId,currentOrder);
        }
        else{
            orders.put(cartOrderFoodId, order);
        }
    }

    public void removeOrderFromCart (CartOrder order) {
        String cartOrderFoodId=order.getFood().getFoodId();
        orders.remove(cartOrderFoodId);
    }
}
