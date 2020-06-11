package com.kdg.recipe.repositories;

import com.kdg.recipe.domains.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
