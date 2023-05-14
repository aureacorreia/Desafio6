package br.edusync.com.desafio6.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Data
@Entity(name = "tb_Consulta")
public class ConsultaModel {
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer idDeConsulta;
    @Column (name = "data_marcada")
    String dataDaConsulta;

    @Column (name = "hora_marcada")
    Date horarioDaConsulta;

    @Column (name = "nome_do_Paciente")
    String nomeDoPaciente;

}
