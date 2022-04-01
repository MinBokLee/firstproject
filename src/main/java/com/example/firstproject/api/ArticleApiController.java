package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //RestAPI 용 컨트롤러! 데이터(JSON)을 반환
public class ArticleApiController {

    @Autowired // DI(외부에서 가져온다)
    private ArticleRepository articleRepoistory;
    //GET
    @GetMapping("/api/articles")
    public List<Article> index(){

        return articleRepoistory.findAll();
    }

    @GetMapping("/api/articles/{id}")
    public Article index(@PathVariable Long id){

        return articleRepoistory.findById(id).orElse(null);
    }

    //POST
    @PostMapping("/api/articles")
    public Article create(@RequestBody ArticleForm dto){
        Article article = dto.toEntity();
        return articleRepoistory.save(article);
    }
    //PATH

    //DELETE
}
