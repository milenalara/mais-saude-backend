package org.example.maissaudeapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "historico")
public class Historico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @OneToMany
  List<Consulta> consultas;

  @OneToMany
  List<Sintoma> sintomas;

  @OneToMany
  List<Medicacao> medicacoes;

  @OneToMany
  List<Exame> exames;

  public Historico() {
  }

  public Historico(Long id,
                   List<Consulta> consultas,
                   List<Sintoma> sintomas,
                   List<Medicacao> medicacoes,
                   List<Exame> exames) {
    this.id = id;
    this.consultas = consultas;
    this.sintomas = sintomas;
    this.medicacoes = medicacoes;
    this.exames = exames;
  }
}
