package com.workintech.movieactor.repository;

import com.workintech.movieactor.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
