package com.kdg.recipe.services;

import com.kdg.recipe.commands.RecipeCommand;
import com.kdg.recipe.domains.Recipe;

import java.util.Set;

public interface RecipeService {

    Recipe findById(Long id);

    Set<Recipe> getRecipes();

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}
