package org.example.maissaudeapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.maissaudeapi.entity.enums.Especialidade;

@Entity
@Table(name = "medico")
public class Medico extends Usuario{
  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  Especialidade especialidade;

  @Column(nullable = false, length = 11)
  String cpf;

  @Column(nullable = false, length = 6)
  String crm;
}
