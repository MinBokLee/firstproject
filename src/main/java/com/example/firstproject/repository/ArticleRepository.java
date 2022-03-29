package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//Entity 의 대표값의 타입을 두 번째 인자로 넣어줘야 한다.
// Article을 CRUD 하는 기본 등작을 추가코딩 및 구현없이 사용이 가능 하다.
public interface ArticleRepository extends CrudRepository<Article,Long> {
    @Override
    ArrayList<Article> findAll();
}
