package org.example.maissaudeapi.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "data_hora")
  LocalDateTime dataHora;

  @ManyToOne
  @JoinColumn(nullable = false, name = "paciente_id")
  Paciente paciente;

  @ManyToOne
  @JoinColumn(nullable = false, name = "medico_id")
  Medico medico;

  String registro;

  public Consulta() {
  }

  public Consulta(Long id,
                  LocalDateTime dataHora,
                  Paciente paciente,
                  Medico medico,
                  String registro) {
    this.id = id;
    this.dataHora = dataHora;
    this.paciente = paciente;
    this.medico = medico;
    this.registro = registro;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public String getRegistro() {
    return registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }
}
