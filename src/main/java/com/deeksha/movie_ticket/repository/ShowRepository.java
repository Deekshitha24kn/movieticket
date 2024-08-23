package com.deeksha.movie_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deeksha.movie_ticket.dto.Screen;
import com.deeksha.movie_ticket.dto.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {

	List<Show> findByScreenIn(List<Screen> screens);

}