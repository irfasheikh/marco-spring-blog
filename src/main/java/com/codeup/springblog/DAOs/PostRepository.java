package com.codeup.springblog.DAOs;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Ad, Long> {


}
