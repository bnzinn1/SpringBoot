// package
package com.davi.app.Tarefas.service;
// imports
import org.springframework.stereotype.Service;
import org.springframework.web.server.*;
import org.springframework.http.*;
import java.util.*;
import com.davi.app.Tarefas.repository.TarefasRepository;
import com.davi.app.Tarefas.model.Tarefas;
// classe
@Service
public class TarefasService {
  
  private final TarefasRepository repository;
  public TarefasService(TarefasRepository repository) {
    this.repository = repository;
  }
  public String criarTarefa(String titulo) {
    Tarefas tarefa = new Tarefas(titulo);
    repository.save(tarefa);
    return "Tarefa criada";
  }
  public String completarTarefa(long id) {
        Tarefas tarefa = repository.findById(id).orElseThrow(() -> new ResponseStatusException(
      HttpStatus.NOT_FOUND, "Tarefa inexistente"
    ));
    tarefa.alterarAtiva(false);
    repository.save(tarefa);
    return "Tarefa desativada";
  }
  public List<Tarefas> Tarefas() {
    return repository.findAll();
  }
}