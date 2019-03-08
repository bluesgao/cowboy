package com.bluesgao.cowboy.article.service;

import com.bluesgao.cowboy.facade.entity.article.ArticleDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

    @Autowired
    private ArticleServiceImpl articleService;
    @Test
    public void post() {
        ArticleDetail input = new ArticleDetail();
        input.setId(1);
        input.setTitle("荷塘月色");
        input.setAuthorName("朱自清");
        articleService.post(input);
    }

    @Test
    public void draft() {
    }

    @Test
    public void delete() {
    }
}