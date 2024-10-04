package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Movie;
import com.example.demo.service.MovieService;

@RestController

public class MovieController {
    
   @Autowired
   private MovieService movieservice;

   @GetMapping("/hello")
   public String sayHello(){
    return "Welcome to the movies api";
   }

   @PostMapping("/movies")
   public String createMovie(@RequestBody Movie movie)
   {
      movieservice.savemovie(movie);
    return "Movie added Successfully";
   }

}
