package com.deeksha.movie_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deeksha.movie_ticket.dto.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Integer>{

	boolean existsByName(String name);

}
