package com.bbangjun.web;

import com.bbangjun.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService; // 150p

    @GetMapping("/posts/save")
    public String postsSave(){ // /posts/save 호출 시 posts-save.mustache를 호출하는 메서드
        return "posts-save";
    }

    @GetMapping("/")
    public String index(Model model){ // 150p
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }
}
