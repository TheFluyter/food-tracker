package com.thefluyter.foodtracker.controller;

import com.thefluyter.foodtracker.model.UserConsumption;
import com.thefluyter.foodtracker.service.FoodTrackingService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/consumption")
public class UserConsumptionController {

    private final FoodTrackingService foodTrackingService;

    public UserConsumptionController(FoodTrackingService foodTrackingService) {
        this.foodTrackingService = foodTrackingService;
    }

    @PostMapping
    public UserConsumption addUserConsumption(@RequestParam Long productId, @RequestParam double quantity) {
        return foodTrackingService.addUserConsumption(productId, quantity);
    }

    @GetMapping
    public List<UserConsumption> getUserConsumptionByDate(@RequestParam String date) {
        return foodTrackingService.getUserConsumptionByDate(LocalDate.parse(date));
    }
}
