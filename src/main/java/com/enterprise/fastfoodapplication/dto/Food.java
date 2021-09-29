package com.enterprise.fastfoodapplication.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public @Data
class Food {

    private String foodId;
    private String foodName;
    private String foodCategory;
    private String foodDescription;
    private double foodPrice;
    private MultipartFile foodImage;

}
