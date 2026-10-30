package com.davi.app.Tarefas.model;
import jakarta.persistence.*;

@Entity
public class Tarefas {
  protected String titulo;
  protected boolean ativa;
  @Id
  @GeneratedValue
  private long id;
  public String getTitulo() {
    return titulo;
  }  
  public long getId() {
    return id;
  }
  public boolean getAtiva() {
    return ativa;
  }
  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public Tarefas(String titulo) {
    this.titulo = titulo;
    this.ativa = true;
  }
  public Tarefas() {
    
  }
  public void alterarAtiva(boolean ativa) {
      this.ativa = ativa;
   }
}