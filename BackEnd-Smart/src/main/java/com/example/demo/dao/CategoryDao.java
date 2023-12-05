package com.example.demo.dao;

import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryDao extends JpaRepository<Category,Long> {

}
