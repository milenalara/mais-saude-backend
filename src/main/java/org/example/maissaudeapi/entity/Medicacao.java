package org.example.maissaudeapi.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "medicacao")
public class Medicacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  String nome;

  @Column(nullable = false)
  Double dosagem;

  @Column(nullable = false)
  String posologia;

  @Column(nullable = false)
  LocalDateTime dataHoraInicio;

  LocalDateTime dataHoraFim;

  String descricao;

  public Medicacao() {
  }

  public Medicacao(Long id, String nome, Double dosagem, String posologia, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String descricao) {
    this.id = id;
    this.nome = nome;
    this.dosagem = dosagem;
    this.posologia = posologia;
    this.dataHoraInicio = dataHoraInicio;
    this.dataHoraFim = dataHoraFim;
    this.descricao = descricao;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getDosagem() {
    return dosagem;
  }

  public void setDosagem(Double dosagem) {
    this.dosagem = dosagem;
  }

  public String getPosologia() {
    return posologia;
  }

  public void setPosologia(String posologia) {
    this.posologia = posologia;
  }

  public LocalDateTime getDataHoraInicio() {
    return dataHoraInicio;
  }

  public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  public LocalDateTime getDataHoraFim() {
    return dataHoraFim;
  }

  public void setDataHoraFim(LocalDateTime dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
