package com.project.orderfood.controller;

import com.project.orderfood.entity.Food;
import com.project.orderfood.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

@RestController
@RequestMapping("/api/v1/foods")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public ResponseEntity<List<Food>> getAllFood(){
        return ResponseEntity.ok(foodRepository.findAll());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable int id) {
        return Optional.ofNullable(foodRepository.findById(id))
                .map(food -> ResponseEntity.ok().body(food))
                .orElse(ResponseEntity.notFound().build());
    }
}
