package com.codeup.springblog;

import org.springframework.web.bind.annotation.*;

public class PostController {

        @RequestMapping(path = "/posts" , method = RequestMethod.GET)
        @ResponseBody

        public String PostIndex() {
            return "This is the index page";
        }

        @RequestMapping(path = "posts/{id}" , method = RequestMethod.GET)
        @ResponseBody

        public String Post (@PathVariable int id) {
            return "Individual post id: " + id;
        }

        @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
        @ResponseBody

        public String viewForm() {
            return "post creation form";
        }

        @PostMapping(path="/posts/create")
        @ResponseBody

        public String createPost() {
            return "create a post";
        }






}
