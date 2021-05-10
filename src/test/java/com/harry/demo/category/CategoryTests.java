package com.harry.demo.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CategoryTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testGetName() {
        Category category = new Category("Games");
        Assertions.assertTrue(category.getName() == "Games");
    }

    @Test
    public void testSetName() {
        Category category = new Category();
        category.setName("Games");
        Assertions.assertTrue(category.getName() == "Games");
    }

    @Test
    public void testGetAndSetCategoryId() {
        Category category = new Category();
        category.setCategory_id(5L);
        Assertions.assertTrue(category.getCategory_id() == 5L);
    }

}
