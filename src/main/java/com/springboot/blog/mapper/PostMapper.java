package com.springboot.blog.mapper;

import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostDto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    PostDto postToPostDto(Post post);

    Post postDtoToPost(PostDto postDto);

    List<PostDto> postToPostDtoList(List<Post> posts);

    List<Post> postDtoToPostList(List<PostDto> postDtos);

}
