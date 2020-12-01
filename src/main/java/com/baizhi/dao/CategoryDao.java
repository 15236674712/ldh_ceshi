package com.baizhi.dao;

import com.baizhi.entity.Category;
import com.baizhi.entity.Video;

import java.util.List;

public interface CategoryDao {


    Category qyertById(String i);

    List<Category> queryAll();
    
    List<Category> queryAlls();
    List<Category> queryAlles();

    List<Video> querys();

    Category query();


    Category queryByName();

    Video queryByCount();

}
