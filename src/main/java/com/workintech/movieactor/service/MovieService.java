package com.workintech.movieactor.service;

import com.workintech.movieactor.entity.Actor;
import com.workintech.movieactor.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findById(int id);
    Movie save(Movie movie);
    Movie delete(int id);
}
