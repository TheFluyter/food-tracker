package com.thefluyter.foodtracker.controller;

import com.thefluyter.foodtracker.model.FoodItem;
import com.thefluyter.foodtracker.service.FoodTrackingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class FoodItemController {

    private final FoodTrackingService foodTrackingService;

    public FoodItemController(FoodTrackingService foodTrackingService) {
        this.foodTrackingService = foodTrackingService;
    }

    @GetMapping
    public List<FoodItem> getAllProducts() {
        return foodTrackingService.getAllProducts();
    }
}
