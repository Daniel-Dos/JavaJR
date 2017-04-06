package com.danieldias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieldias.model.Tarefa;

@Repository
public interface  TarefaRepositorio extends JpaRepository<Tarefa,Integer> {
}