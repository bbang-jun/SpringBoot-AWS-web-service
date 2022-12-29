package com.bbangjun.web;

import com.bbangjun.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller를 JSON을 반환하는 controller로 만들어줌
public class HelloController {

    @GetMapping("/hello") // GET 요청을 받을 수 있는 API를 만들어줌
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto") // 75p
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){ // @RequestParam: 외부에서 API로 넘긴 파라미터를 가져옴
        return new HelloResponseDto(name, amount);
    }
}
