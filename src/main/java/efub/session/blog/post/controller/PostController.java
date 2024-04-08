package efub.session.blog.post.controller;

import efub.session.blog.post.domain.Post;
import efub.session.blog.post.dto.post.AllPostsResponseDto;
import efub.session.blog.post.dto.post.PostRequestDto;
import efub.session.blog.post.dto.post.PostResponseDto;
import efub.session.blog.post.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


public class PostController {
    private final PostService postService;

    /*게시글 작성*/
//    public PostResponseDto createNewPost(){
//    }

    /*게시글 조회_전체*/
//    public AllPostsResponseDto getAllPosts(){
//    }

    /*게시글 조회_1개*/
//    public PostResponseDto getOnePost(){
//    }

    /*게시글 수정*/
//    public PostResponseDto updatePost(){
//    }

    /*게시글 삭제*/
//    public String deletePost(){
//    }

}