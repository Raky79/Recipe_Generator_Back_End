package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Quantity;
import com.example.RecipeGeneratorBackEnd.repositories.QuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuantitiesController {

    @Autowired
    QuantityRepository quantityRepository;

    @GetMapping(value = "/quantities")
    public ResponseEntity<List<Quantity>> getAllQuantities(@RequestParam(name = "ingredientName", required=false) String ingredientName) {
        if (ingredientName != null) {
            List<Quantity> quantities = quantityRepository.findByIngredientName(ingredientName);
            return new ResponseEntity<>(quantities, HttpStatus.OK);
        }
        return new ResponseEntity<>(quantityRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/quantities/{id}")
    public ResponseEntity getQuantities(@PathVariable Long id) {
        return new ResponseEntity<>(quantityRepository.findById(id), HttpStatus.OK);
    }


}