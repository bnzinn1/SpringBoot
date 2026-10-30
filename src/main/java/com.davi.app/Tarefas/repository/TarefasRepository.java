package com.davi.app.Tarefas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.davi.app.Tarefas.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
  
}