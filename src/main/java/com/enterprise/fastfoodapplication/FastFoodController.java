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

@Controller
public class FastFoodController {

    private static Logger logger = Logger.getLogger("com.enterprise.fastfoodapplication.FastFoodController");

    @Autowired
    IFoodService foodService;

    @RequestMapping("/")
    public String index(Model model) {
        /**
         * Need an orderHistory class to store the name and number of Items a customer ordered.
         * This happens when the user click "check out".
         * The "check out" button act like a "save" button to store the information of order in OrderHistory class.
         * */
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
    public Map<String, Food> fetchAllFood(){
        return foodService.getAllFoodItems();
    }
    @GetMapping("/Food/id/")
    public Food fetchFoodbyId(@PathVariable("id") String id){
        return foodService.getFoodItemById(id);
    }
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
    @PostMapping(value="/Food/id/", consumes ="application/json", produces = "application/json")
    public Food updateFood(@PathVariable("id") String id){
        Food newFood =null;
        newFood = foodService.getFoodItemById(id);
        foodService.updateFoodItem(id);
        return newFood;
    }
    @DeleteMapping("/Food/id/")
    public String deleteFood(@PathVariable("id") String id){
        foodService.removeFoodItem(id);
        return "redirect";
    }
}
