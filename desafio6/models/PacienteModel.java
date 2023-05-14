package br.edusync.com.desafio6.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity(name ="tb_paciente")
@Data
public
class PacienteModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDePaciente")
   @Id
    Integer id;
  String nome;
  String horarioDaConsulta;

  String dataDaConsulta;
}
