package br.edusync.com.desafio6.repository;

import br.edusync.com.desafio6.models.ClinicaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicaRepository extends JpaRepository<ClinicaModel,Integer> {
}
