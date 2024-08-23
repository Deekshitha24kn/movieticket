package com.deeksha.movie_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deeksha.movie_ticket.dto.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}