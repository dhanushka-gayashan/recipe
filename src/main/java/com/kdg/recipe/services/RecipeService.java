package com.kdg.recipe.services;

import com.kdg.recipe.domains.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
