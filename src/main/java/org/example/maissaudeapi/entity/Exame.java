package org.example.maissaudeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exame")
public class Exame {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Lob
  @Column(name = "file_data", nullable = false)
  byte[] fileData;

  @Column(name = "file_name", nullable = false)
  String fileName;

  @Column(name = "file_type", nullable = false)
  String fileType;

  // Getters and Setters

  public Exame() {
  }

  public Exame(Long id,
               byte[] fileData,
               String fileName,
               String fileType) {
    this.id = id;
    this.fileData = fileData;
    this.fileName = fileName;
    this.fileType = fileType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public byte[] getFileData() {
    return fileData;
  }

  public void setFileData(byte[] fileData) {
    this.fileData = fileData;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }
}