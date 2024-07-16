package com.thefluyter.foodtracker.repository;

import com.thefluyter.foodtracker.model.UserConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserConsumptionRepository extends JpaRepository<UserConsumption, Long> {
    List<UserConsumption> findByConsumptionDate(LocalDate date);
}
