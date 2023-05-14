package br.edusync.com.desafio6.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_agenda")
public class AgendaModel {
    @Column (name = "tb_agenda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer idDeConsulta;
    String consultaMarcada;

}





