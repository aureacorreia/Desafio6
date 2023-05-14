package br.edusync.com.desafio6.repository;

import br.edusync.com.desafio6.models.VeterinarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<VeterinarioModel,Integer> {

    static boolean existById(Integer id) {
    }

    static void deletById(Integer id) {
    }
}
