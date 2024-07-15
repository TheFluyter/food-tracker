package com.thefluyter.foodtracker.service;

import com.thefluyter.foodtracker.model.FoodItem;
import com.thefluyter.foodtracker.model.UserConsumption;
import com.thefluyter.foodtracker.repository.FoodItemRepository;
import com.thefluyter.foodtracker.repository.UserConsumptionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FoodTrackingService {

    private final FoodItemRepository foodItemRepository;
    private final UserConsumptionRepository userConsumptionRepository;

    public FoodTrackingService(FoodItemRepository foodItemRepository, UserConsumptionRepository userConsumptionRepository) {
        this.foodItemRepository = foodItemRepository;
        this.userConsumptionRepository = userConsumptionRepository;
    }

    public List<FoodItem> getAllProducts() {
        return foodItemRepository.findAll();
    }

    public UserConsumption addUserConsumption(Long productId, double quantity) {
        FoodItem foodItem = foodItemRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        UserConsumption consumption = new UserConsumption();
        consumption.setFoodItem(foodItem);
        consumption.setQuantity(quantity);
        consumption.setConsumptionDate(LocalDate.now());
        return userConsumptionRepository.save(consumption);
    }

    public List<UserConsumption> getUserConsumptionByDate(LocalDate date) {
        return userConsumptionRepository.findByConsumptionDate(date);
    }
}
