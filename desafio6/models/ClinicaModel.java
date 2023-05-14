package br.edusync.com.desafio6.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity(name = "tb_clinica")
public class ClinicaModel {
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer clinicaId;
    @Column (length = 50)
    String medico;
    @Column (length = 50 )
    String cnpj;

    @ManyToOne
    private AgendaModel agendaModel;

}
