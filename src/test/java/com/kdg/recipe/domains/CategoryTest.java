package com.kdg.recipe.domains;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    void getDescription() {
        String desc = "test";
        category.setDescription(desc);
        assertEquals(desc, category.getDescription());
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        category.getRecipes().add(recipe);
        assertEquals(1, category.getRecipes().size());
    }
}