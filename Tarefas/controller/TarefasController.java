package com.davi.app.Tarefas.controller;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.davi.app.Tarefas.service.TarefasService;
import com.davi.app.Tarefas.model.Tarefas;

@RestController
public class TarefasController {
  public static void main(String[] args) {
    SpringApplication.run(TarefasController.class, args);
  }
  private final TarefasService service;
  public TarefasController(TarefasService service) {
    this.service = service;
  }
  @PostMapping("/tarefas")
  public String criarTarefa(@RequestParam String titulo) {
    return service.criarTarefa(titulo);
  }
  @PutMapping("/tarefas/{id}")
  public String completarTarefa(@PathVariable long id) {
    return service.completarTarefa(id);
  }
  @GetMapping("/tarefas")
  public List<Tarefas> Tarefas() {
    return service.Tarefas();
  }
}