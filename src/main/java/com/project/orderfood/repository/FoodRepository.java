package com.project.orderfood.repository;

import com.project.orderfood.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {
    Food findById(int id);
}
