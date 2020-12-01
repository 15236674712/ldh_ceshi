package com.baizhi.dao;

import com.baizhi.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video> queryByVideoName(String title);


    Video queryByVideoId();

    Video queryByVideoIds();


    Video aaa();

    Video bbb();

    Video ccc();

    Video query();
}
