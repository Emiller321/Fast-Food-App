package com.enterprise.fastfoodapplication;

import com.enterprise.fastfoodapplication.dto.CartOrder;
import com.enterprise.fastfoodapplication.dto.Food;
import com.enterprise.fastfoodapplication.dto.OrderHistory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FastFoodController {
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


}
