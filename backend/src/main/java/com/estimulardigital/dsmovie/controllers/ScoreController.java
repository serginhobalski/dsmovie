package com.estimulardigital.dsmovie.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estimulardigital.dsmovie.dto.MovieDTO;
import com.estimulardigital.dsmovie.dto.ScoreDTO;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		return null;
	}
}
