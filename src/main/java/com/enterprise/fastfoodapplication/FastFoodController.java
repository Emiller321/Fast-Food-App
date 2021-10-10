package com.enterprise.fastfoodapplication;

import com.enterprise.fastfoodapplication.dto.Food;
import com.enterprise.fastfoodapplication.dto.OrderHistory;
import com.enterprise.fastfoodapplication.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The controller for Fast Food Application food items REST endpoints and web UI
 * <p>
 * This class handles the CRUD operations for Fast Food Application food items, via HTTP actions.
 * </p>
 * <p>
 * This class also serves HTML based web pages, for UI interactions with Food Items.
 * </p>
 * @author Bipal Goyal
 */
@Controller
public class FastFoodController {

    private static final Logger logger = Logger.getLogger("com.enterprise.fastfoodapplication.FastFoodController");

    @Autowired
    IFoodService foodService;

    @RequestMapping("/")
    public String index(Model model) {
        /*
          Need an orderHistory class to store the name and number of Items a customer ordered.
          This happens when the user click "check out".
          The "check out" button act like a "save" button to store the information of order in OrderHistory class.
          */
        OrderHistory orderHistory= new OrderHistory();
        orderHistory.setFoodAmount(2);
        orderHistory.setFoodName("burger");
        model.addAttribute(orderHistory);
        return "start";
    }

    /**
     * This is for search bar on the navigation bar.
     * This happens when the user click "search".
     * */
    @GetMapping("/Food")
    public ResponseEntity searchFood(@RequestParam(value="searchTerm",required = false,defaultValue = "None") String searchTerm){
        String newSearchTerm = searchTerm + "";
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     *This is for fetch, post and delete.
     *
     * */
    @GetMapping("/Food")
    public ResponseEntity fetchAllFood(){
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Fetch a food with the given ID.
     *
     * Given the parameter id, find a specimen that corresponds to this unique ID.
     *
     * Returns one of the following status codes:
     * 200: food found
     * 400: food not found
     *
     * @param id a unique identifier for this food
     */
    @GetMapping("/Food/{id}/")
    public ResponseEntity fetchFoodById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Create a new Food object, given the data provided.
     *
     * returns one of the following status codes:
     * 201: successfully created a new food.
     * 409: unable to create a food, because it already exists.
     *
     * @param food a JSON representation of a food object.
     * @return the newly created food object.
     */
    @PostMapping(value="/Food", consumes ="application/json", produces = "application/json")
    public Food createFood(@RequestBody Food food){
        Food newFood = null;
        try {
            foodService.createFoodItem(food);
        } catch (Exception e){
            logger.log(Level.WARNING, "Failed to create food item");
        }
        return food;
    }
    @PostMapping(value="/Food/{id}/", consumes ="application/json", produces = "application/json")
    public Food updateFood(@PathVariable("id") String id){
        Food newFood = new Food();
        newFood = foodService.getFoodItemById(id);
        foodService.updateFoodItem(id);
        return newFood;
    }
    @DeleteMapping("/Food/{id}/")
    public ResponseEntity deleteFood(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}
