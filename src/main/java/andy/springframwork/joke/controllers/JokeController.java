package andy.springframwork.joke.controllers;

import andy.springframwork.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weat0212@gmail.com
 * @project jokeapp
 * @package com.example.joke.controllers
 * @date 2020/11/19 下午 03:50
 */

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
