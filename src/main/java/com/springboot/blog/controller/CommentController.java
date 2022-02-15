package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.service.CommentService;
import com.springboot.blog.utils.SuccessStatusMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/post/{postId}/comment")
    public ResponseEntity<Object> createComment(@PathVariable(value = "postId") long postId, @RequestBody CommentDto commentDto) {
        SuccessStatusMessage<CommentDto> message = new SuccessStatusMessage<>("Success", commentService.createComment(postId, commentDto), true);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Object> getAllCommentByPostId(@PathVariable(value = "postId") long postId) {
        SuccessStatusMessage<List<CommentDto>> message = new SuccessStatusMessage<>("Success", commentService.getAllCommentsByPostId(postId), true);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<Object> getByCommentId(@PathVariable(value = "id") long id) {
        SuccessStatusMessage<CommentDto> message = new SuccessStatusMessage<>("Success", commentService.getCommentById(id), true);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
