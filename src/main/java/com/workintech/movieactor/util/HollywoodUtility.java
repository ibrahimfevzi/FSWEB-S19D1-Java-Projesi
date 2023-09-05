package com.workintech.movieactor.util;

import com.workintech.movieactor.dto.ActorResponse;
import com.workintech.movieactor.dto.MovieActorResponse;
import com.workintech.movieactor.dto.MovieResponse;
import com.workintech.movieactor.entity.Actor;
import com.workintech.movieactor.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class HollywoodUtility {

    public static MovieActorResponse convertMovieActorResponse(Movie movie, Actor actor) {
        return new MovieActorResponse(movie, actor.getId(), actor.getFirstName(),
                actor.getLastName(), actor.getBirthDate());
    }

    public static List<ActorResponse> convertActorResponses(Movie savedMovie){
        List<ActorResponse> actorResponses = new ArrayList<>();
        for (Actor actor : savedMovie.getActors()) {
            actorResponses.add(new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName(),
                    actor.getBirthDate()));
        }
        return actorResponses;
    }

}
