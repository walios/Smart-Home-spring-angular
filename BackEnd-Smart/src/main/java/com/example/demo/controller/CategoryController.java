package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;

    @GetMapping("/Category/findAll")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("/Category/save")
    public <S extends Category> S save(@RequestBody S entity) {
        return categoryService.save(entity);
    }

    @GetMapping("/Category/find_id/{id}")
    public Optional<Category> findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @DeleteMapping("/Category/delete")
    public void delete(@RequestBody Category entity) {
        categoryService.delete(entity);
    }
}
