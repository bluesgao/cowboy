package com.bluesgao.cowboy.article.dao;

import com.bluesgao.cowboy.article.entity.Tag;

import java.util.List;

public interface TagDao {
    boolean save(Tag tag);
    boolean edit(Tag tag);
    List<Tag> list(Tag tag);
}
