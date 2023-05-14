package br.edusync.com.desafio6.repository;

import br.edusync.com.desafio6.models.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository <AgendaModel,Integer> {
}
