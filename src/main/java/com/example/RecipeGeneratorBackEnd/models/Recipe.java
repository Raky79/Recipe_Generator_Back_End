package com.example.RecipeGeneratorBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipeName")
    private String recipeName;

    @Column(name = "recipeDescription")
    private String recipeDescription;

    @Column(name = "serving")
    private int serving;

    @Column(name = "rating")
    private double rating;

    DietType dietType;
    CuisineType cuisineType;
    MealType mealType;

    @JsonIgnoreProperties({"recipe"})
    @OneToMany(mappedBy = "recipe_id", fetch = FetchType.LAZY)
    private List<Ingredient> ingredients;

    @OneToMany(mappedBy = "recipe_id", fetch = FetchType.LAZY)
    private List<Instruction> instructions;
    public Recipe(String recipeName, String recipeDescription, int serving, double rating,
            DietType dietType, CuisineType cuisineType, MealType mealType) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.serving = serving;
        this.rating = rating;
        this.dietType = dietType;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.ingredients = new ArrayList<>();
        this.instructions = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


}