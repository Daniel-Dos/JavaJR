package com.danieldias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.danieldias.model.Tarefa;
import com.danieldias.service.TarefaServico;

@RestController
public class TarefaController {

    @Autowired
    private TarefaServico tarefaServico;

    @PostMapping("/tarefas/")
    public Tarefa inserirTarefa(@RequestBody Tarefa tarefa) {
	this.tarefaServico.salvarTarefa(tarefa);
	System.out.println("Tarefa Adicionada");
	return tarefa;
    }

    @GetMapping("/tarefas/")
    public List<Tarefa> getTarefas() {
	System.out.println("consutando todos");
	return this.tarefaServico.listarTarefas();
    }

    @DeleteMapping("/tarefas/{id}")
    public @ResponseBody void deletarTarefa(@PathVariable("id") int id) {
	this.tarefaServico.removerTarefa(id);
	System.out.println("Tarefa removida");
    }
}