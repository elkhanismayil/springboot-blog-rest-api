package com.springboot.blog.mapper;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    CommentDto toCommentDto(Comment comment);

    Comment dtoToComment(CommentDto commentDto);

    List<CommentDto> toCommentDtoList(List<Comment> comments);
}
