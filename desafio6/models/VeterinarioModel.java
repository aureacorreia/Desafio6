package br.edusync.com.desafio6.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_Medico")
public class VeterinarioModel<I extends Number> {
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer idDoVet;
    @Column (name = "nome_do_veterinario")
    String nomeDoVet;

    public void save(VeterinarioModel novoVeterinario) {
    }
}
