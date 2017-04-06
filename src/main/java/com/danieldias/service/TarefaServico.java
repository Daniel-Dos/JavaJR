package com.danieldias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldias.model.Tarefa;
import com.danieldias.repositorio.TarefaRepositorio;

@Service
public class TarefaServico {

    @Autowired
    private TarefaRepositorio tarefaRepositorio;

    public void salvarTarefa(Tarefa tarefa) {
	this.tarefaRepositorio.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
	return this.tarefaRepositorio.findAll();
    }

    public void removerTarefa(int id) {
	this.tarefaRepositorio.delete(id);
    }
}