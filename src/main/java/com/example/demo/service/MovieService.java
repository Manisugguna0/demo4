package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Movie;
import com.example.demo.repository.MovieRepository;

@Service

public class MovieService{

@Autowired
 private MovieRepository movieRepository;

    public void savemovie(Movie movie){
        System.out.println("Saving movie "+movie.toString());
    }

    
}