package org.example.maissaudeapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.maissaudeapi.entity.enums.Genero;

import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente extends Usuario {
  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  LocalDate dataNascimento;

  @Column(nullable = false)
  Genero genero;

  @Column(nullable = false, length = 11)
  String cpf;

  public Paciente() {
  }

  public Paciente(String name,
                  LocalDate dataNascimento,
                  Genero genero,
                  String cpf) {
    this.name = name;
    this.dataNascimento = dataNascimento;
    this.genero = genero;
    this.cpf = cpf;
  }
}
