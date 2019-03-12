package com.bluesgao.cowboy.article.service;

import com.bluesgao.cowboy.facade.entity.article.ArticleVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

    @Autowired
    private ArticleServiceImpl articleService;
    @Test
    public void post() {
        ArticleVo input = new ArticleVo();
        input.setTitle("背影111");
        input.setAuthorName("朱自清111");
        input.setAuthorId(10001L);
        input.setPublishTime(new Date());
        input.setContent("那年冬天，祖母死了，父亲的差使1也交卸了，正是祸不单行的日子。我从北京到徐州，打算跟着父亲奔丧2回家。到徐州见着父亲，看见满院狼藉3的东西，又想起祖母，不禁簌簌地流下眼泪。父亲说：“事已如此，不必难过，好在天无绝人之路！”");
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

    @Test
    public void edit() {
        ArticleVo input = new ArticleVo();
        input.setAuthorName("gaoxin");
        articleService.edit(input);
    }
}