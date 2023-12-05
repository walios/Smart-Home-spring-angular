package com.example.demo.service;


import com.example.demo.dao.CategoryDao;
import com.example.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    public <S extends Category> S save(S entity) {
        return categoryDao.save(entity);
    }

    public Optional<Category> findById(Long aLong) {
        return categoryDao.findById(aLong);
    }

    public void delete(Category entity) {
        categoryDao.delete(entity);
    }
}
