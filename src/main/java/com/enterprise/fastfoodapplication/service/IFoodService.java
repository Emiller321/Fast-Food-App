package com.enterprise.fastfoodapplication.service;

import com.enterprise.fastfoodapplication.dto.Food;

import java.util.Map;

/**
 * This interface (when implemented) will allow us to manage Food items by providing CRUD operations that update the
 * Food table in the database. The CRUD operations will be called when Administrators of the website will be logged in
 * while Read operation will be used in the front-end side for the customers.
 */
public interface IFoodService {


    /**
     * This method is used to retrieve Food details with foodId == id. The id will probably be passed as a
     * GET request through an endpoint or through URL routes directly for the front end of the website.
     * @param id It is a string (maybe int?) that is compared with foodId
     * @return A Food object containing the details of the food item if found in database, otherwise return NULL
     */
    Food getFoodItemById(String id);

    /**
     * This method is used to return a HashMap of all the food items that exist within the database. Return NULL
     * if food Table is empty in database.
     * @return a HashMap that has String as key and Food object as value.
     */
    Map<String, Food> getAllFoodItems();

    /**
     * This method invokes another method within the DAO (persistence) package and save the Food item
     * to the database.
     * @param food This is a Food object containing details that will be saved in the db.
     */
    void createFoodItem(Food food);

    /**
     * This method is used to update details about an existing food Item based off of its foodId value.
     * We probably need to invoke a edit operation within the persistence layer and pass it a Food object as
     * our parameter. Throw exception if there is no food with foodId == id.
     * @param id It is a string (maybe int?) that is compared with foodId
     */
    void updateFoodItem(String id);

    /** This method is used to remove an existing food Item based off of its foodId value.
     * We probably need to invoke a delete operation within the persistence layer and pass it id as our parameter.
     * Throw exception if there is no food with foodId == id.
     * @param id It is a string (maybe int?) that is compared with foodId
     */
    void removeFoodItem(String id);

}
