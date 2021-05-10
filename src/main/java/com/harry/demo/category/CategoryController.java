package com.harry.demo.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(path="/all")
    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping(path="/get/{id}")
    public Optional<Category> getCategoryById(@PathVariable("id") Long id) throws Exception {
        //get the category with that id if it exists
        Optional<Category> category = categoryRepository.findById(id);
        //if it exists
        if(category.isPresent()){
            //return it
            return category ;
        }else{
            //otherwise throw exception
            throw new Exception("No category with this id");
        }
    }

    @PostMapping(path="/add")
    public @ResponseBody void addCategory(@RequestParam String name) throws Exception {
        //make the new category
        Category a = new Category(name);
        //if there is already a category with this name
        if(categoryRepository.findCategoryByName(name).isPresent()){
            //throw error
            throw new Exception("Category with this name already exists");
        }else{
            //otherwise save the category
            categoryRepository.save(a);

        }
    }

    @DeleteMapping(path="/delete/{id}")
    public void deleteCategoryById(@PathVariable("id") Long id) throws Exception {
        //get the category with that id
        Optional<Category> check = getCategoryById(id);
        //if there is a category with that id
        if(check.isPresent()){
            //deletes the category with a specific id
            categoryRepository.deleteById(id);
        }else{
            //if there isnt a category with that id
            throw new Exception("No category with this id");
        }
    }

    @Transactional
    @PutMapping("/modify/{id}")
    public void modifyCategoryById(@PathVariable("id") Long id, @RequestParam String name){
        //gets the category by id if it exists
        Category category = categoryRepository.findById(id).orElseThrow(() -> new IllegalStateException("id not found: " + id));
        //change name
        category.setName(name);
    }

}
