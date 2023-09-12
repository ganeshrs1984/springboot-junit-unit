package com.unit.testing.controller;

import com.unit.testing.dto.Grocery;
import com.unit.testing.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grocery/item")
public class GroceryController {

    @Autowired
    GroceryService groceryService;

    @GetMapping("/all")
    public ResponseEntity<Grocery> getItems(){
        Grocery grocery = groceryService.allItems();
        return ResponseEntity.ok(grocery);
    }
}
