package com.thefluyter.foodtracker.repository;

import com.thefluyter.foodtracker.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
