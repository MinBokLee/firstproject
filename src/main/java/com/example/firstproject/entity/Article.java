package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능!
@AllArgsConstructor //lombok 기본 생성자 자동 생성!
@ToString //lombok ToString 자동 생성!
@NoArgsConstructor //lombok 디폴트 생성자를 추가!
@Getter
public class Article {

    //기본적으로 entity엔 대표값을 하나 넣어줘야 한다.

    @Id //대표 값을 지정! like a 주민등록번호
    @GeneratedValue // 1, ,2 ,3 ... 자동 생성 어노테이션!
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
