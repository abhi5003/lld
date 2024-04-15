package com.interview.lld.services;

import com.interview.lld.dto.CommentDTO;
import com.interview.lld.models.Comment;
import com.interview.lld.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServices {

    static List<Comment> commentRepo=new ArrayList<>();

    // save comment
    public void saveComment(Comment comment){
        commentRepo.add(comment);

    }

    // get all comment

    public  List<Comment> getAllComment(){
        return commentRepo;
    }

    // get comment by postid

    public Comment getCommentByPostId(Integer postId){
        for (Comment comment : commentRepo){
            if(comment.getPost().getP_id()==postId){
                return comment;
            }
        }

        return null;
    }


    // user can reply on comment

    public void replyOnComment(CommentDTO commentDTO){
        int commentId =commentDTO.getC_id();

        Comment comment=commentRepo.get(commentId);
        comment.setC_id(commentDTO.getC_id());
        comment.setPost(commentDTO.getPost());
    }
}
