package br.edusync.com.desafio6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository<PacienteModel> extends JpaRepository<PacienteModel, Integer> {
}
