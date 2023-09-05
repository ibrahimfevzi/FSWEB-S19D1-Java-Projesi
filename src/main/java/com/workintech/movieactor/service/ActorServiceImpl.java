package com.workintech.movieactor.service;

import com.workintech.movieactor.entity.Actor;
import com.workintech.movieactor.exceptions.MovieException;
import com.workintech.movieactor.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(int id) {
        Optional<Actor> actor = actorRepository.findById(id);
        if(actor.isPresent()){
            return actor.get();
        }
        throw new MovieException("Actor is not exist: " + id, HttpStatus.BAD_REQUEST);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor delete(int id) {
        Actor actor = findById(id);
        actorRepository.delete(actor);
        return actor;
    }
}
