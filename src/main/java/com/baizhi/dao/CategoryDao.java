package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDao {


    Category qyertById(String i);

    List<Category> queryAll();

}
