package com.springboot.blog.mapper;

import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "commentDtos", source = "comments")
    PostDto postToPostDto(Post post);

    Post postDtoToPost(PostDto postDto);

    List<PostDto> postToPostDtoList(List<Post> posts);


}
