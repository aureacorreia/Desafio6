package br.edusync.com.desafio6.repository;

import br.edusync.com.desafio6.User.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer > {

    Optional<Usuario> findByEmail(String email);
}
