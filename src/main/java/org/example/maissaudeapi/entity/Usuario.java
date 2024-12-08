package org.example.maissaudeapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@MappedSuperclass
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(nullable = false, unique = true)
  @Email
  String email;

  @Column(nullable = false)
  @Size(min = 8, max = 20)
  String senha;
}
