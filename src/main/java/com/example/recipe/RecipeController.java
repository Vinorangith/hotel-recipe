package com.example.recipe;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

        RecipeService rs = new RecipeService();

        @GetMapping("/recipes")
        public ArrayList<Recipe> getRecipes() {
                return rs.getRecipes();
        }

        @PostMapping("/recipes")
        public Recipe addRecipe(@RequestBody Recipe recipe) {

                return rs.addRecipe(recipe);
        }

        @GetMapping("/recipes/{recipeId}")
        public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
                return rs.getRecipeById(recipeId);
        }

        @PutMapping("/recipes/{recipeId}")
        public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
                return rs.updateRecipe(recipeId, recipe);
        }

        @DeleteMapping("/recipes/{recipeId}")
        public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
                rs.deleteRecipe(recipeId);
        }
}
