package com.ednilson.sisapac.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ednilson.sisapac.modelo.Sala;

@Repository
public interface SalaRepositorio extends JpaRepository<Sala, Integer> {

}
