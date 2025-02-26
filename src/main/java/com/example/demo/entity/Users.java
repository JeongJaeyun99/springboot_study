package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users { // 스키마 구성

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 생성
    private Long id;

    @Column(name = "name",nullable = false,length = 50)
    private String name;

    @Column(name = "email",nullable = false,length = 100)
    private String email;

    @Column(nullable = false)
    private int age;


}
