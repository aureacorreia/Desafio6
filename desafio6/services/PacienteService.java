package br.edusync.com.desafio6.services;

import br.edusync.com.desafio6.models.PacienteModel;
import br.edusync.com.desafio6.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private List<PacienteModel> listaDePacientes = new ArrayList<>();

    public void adicionar(PacienteModel pacienteSalvo){

        listaDePacientes.add(pacienteSalvo);

    }

    public List<PacienteModel> listaTodos(){
        return listaDePacientes;
    }

    public PacienteModel buscarPorId(Integer id){
        Optional<PacienteModel> pacienteModelOptional = PacienteRepository.findById(id);
        if (pacienteModelOptional.isEmpty()){
            throw new RuntimeException("Produto nÃ£o encontrado");
        }
        return pacienteModelOptional.get();
    }

    public void remover(Integer id) {
        if (!PacienteRepository.existsById(id)) return;
        PacienteRepository.deleteById(id);
    }




}
