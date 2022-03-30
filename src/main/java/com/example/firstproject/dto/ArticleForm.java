package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // lombok(기본 생성자 생성)
@ToString // lombok(ToString 생성)
public class ArticleForm {

    private Long id; // id필드 추가
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
