package bbs1120.controller;

import bbs1120.dto.ArticleDto;
import bbs1120.entity.Article;
import bbs1120.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
@Slf4j
public class ArticleController {


    private final ArticleRepository articleRepository;


    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    @GetMapping("/new")
    public String newArticleForm() {
        return "new";
    }

    @PostMapping("/posts")
    public String createArticle(ArticleDto articleDto) {
        log.info(articleDto.toString());
        Article article = articleDto.toEntity();
        articleRepository.save(article);
        return "";
    }
}
