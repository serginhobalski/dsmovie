package com.estimulardigital.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estimulardigital.dsmovie.dto.MovieDTO;
import com.estimulardigital.dsmovie.entities.Movie;
import com.estimulardigital.dsmovie.repositories.MovieRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;
	
	
}
