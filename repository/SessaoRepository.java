package com.br.ufc.vev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufc.vev.model.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long>{

}
