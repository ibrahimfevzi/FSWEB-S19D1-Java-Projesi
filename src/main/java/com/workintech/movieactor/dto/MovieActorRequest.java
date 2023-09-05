package com.workintech.movieactor.dto;

import com.workintech.movieactor.entity.Actor;
import com.workintech.movieactor.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieActorRequest {
    private Movie movie;
    private Actor actor;
}
