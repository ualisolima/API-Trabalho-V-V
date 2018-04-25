package com.br.ufc.vev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufc.vev.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>{

}
