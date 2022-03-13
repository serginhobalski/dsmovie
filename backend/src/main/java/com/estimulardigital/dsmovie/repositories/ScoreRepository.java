package com.estimulardigital.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estimulardigital.dsmovie.entities.Score;
import com.estimulardigital.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
