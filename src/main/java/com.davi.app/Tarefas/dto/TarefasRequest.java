package com.davi.app.Tarefas.dto;

public class TarefasRequest {
    public boolean ativa;
    public String titulo;
public String getTitulo() {
    return titulo;
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
}