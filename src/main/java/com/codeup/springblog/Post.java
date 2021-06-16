package com.codeup.springblog;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;


}
