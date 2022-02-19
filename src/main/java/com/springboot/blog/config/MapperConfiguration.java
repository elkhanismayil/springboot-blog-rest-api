package com.springboot.blog.config;

import com.springboot.blog.mapper.CommentMapper;
import com.springboot.blog.mapper.PostMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public PostMapper postMapper() {
        return PostMapper.INSTANCE;
    }

    @Bean
    public CommentMapper commentMapper() {
        return CommentMapper.INSTANCE;
    }
}
