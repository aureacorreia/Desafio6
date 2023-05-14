package br.edusync.com.desafio6.services;

import br.edusync.com.desafio6.models.VeterinarioModel;
import br.edusync.com.desafio6.repository.VeterinarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {
    private VeterinarioRepository veterinarioRepository;
    public static void adicionar(VeterinarioModel novoVet){

        novoVet.save(novoVet);
    }

    public VeterinarioModel buscarPorId(Integer id) {
        Optional<VeterinarioModel> optionalVeterinarioModel;
        optionalVeterinarioModel = VeterinarioRepository.findById(id);
        if (optionalVeterinarioModel.isEmpty()) {
            throw new RuntimeException("Medico indisponivel");
        }
        return optionalVeterinarioModel.get();
    }

    public List<VeterinarioRepository> listarTudo(){
        return veterinarioRepository.findBy();
    }

    public void remover(Integer id) {
        if (VeterinarioRepository.existById(id))
            VeterinarioRepository.deletById(id);
    }


}
