package com.interview.lld.controller;

import com.interview.lld.dto.CommentDTO;
import com.interview.lld.models.Comment;
import com.interview.lld.services.CommentServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private CommentServices commentServices;

    public CommentController(CommentServices commentServices){
        this.commentServices=commentServices;
    }

    // User can post comment

    @PostMapping("/doComment")
    public void saveComment(@RequestBody Comment comment){
        commentServices.saveComment(comment);
    }

    // get All comment
    @GetMapping("/getAll")
    public List<Comment> getAllComment(){
        return commentServices.getAllComment();
    }

    // get by postID

    @GetMapping("/getById")
    public Comment getByPostId(@PathVariable Integer postId){
        return commentServices.getCommentByPostId(postId);
    }

    public void replyComment(@RequestBody CommentDTO custtomDTo){
        commentServices.replyOnComment(custtomDTo);
    }
}
