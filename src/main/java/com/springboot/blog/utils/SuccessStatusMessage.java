package com.springboot.blog.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessStatusMessage<T> {
    private String message;
    private T data;
    private boolean status;
}
