package com.estimulardigital.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estimulardigital.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
