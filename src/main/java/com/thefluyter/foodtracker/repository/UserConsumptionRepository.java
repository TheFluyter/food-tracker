package com.thefluyter.foodtracker.repository;

import com.thefluyter.foodtracker.model.UserConsumption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface UserConsumptionRepository extends JpaRepository<UserConsumption, Long> {
    List<UserConsumption> findByConsumptionDate(LocalDate date);
}
