package com.interview.lld.dto;

import com.interview.lld.models.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    int u_id;
    Post post;
    int c_id;
}
