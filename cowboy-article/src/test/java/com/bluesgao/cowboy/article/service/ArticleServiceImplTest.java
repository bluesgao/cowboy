package com.bluesgao.cowboy.article.service;

import com.bluesgao.cowboy.facade.entity.article.ArticleVo;
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
        ArticleVo input = new ArticleVo();
        input.setId(2l);
        input.setTitle("背影");
        input.setAuthorName("朱自清");
        articleService.post(input);
    }

    @Test
    public void draft() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void list() {
        ArticleVo input = new ArticleVo();
        input.setAuthorName("朱自清");
        articleService.list(input);
    }
}