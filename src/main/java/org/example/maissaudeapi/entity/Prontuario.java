package org.example.maissaudeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prontuario")
public class Prontuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @OneToOne
  Historico historico;

  public Prontuario() {
  }

  public Prontuario(Long id, Historico historico) {
    this.id = id;
    this.historico = historico;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Historico getHistorico() {
    return historico;
  }

  public void setHistorico(Historico historico) {
    this.historico = historico;
  }
}
