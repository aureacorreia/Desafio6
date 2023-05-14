package br.edusync.com.desafio6.services;

import br.edusync.com.desafio6.models.AgendaModel;
import br.edusync.com.desafio6.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private AgendaRepository agendaRepository;

    private List<ConsultaService> listaDeConsultas = new ArrayList<>();

    public void marcarConsulta(ConsultaService consultaMarcada){

        consultaMarcada.save(consultaMarcada);
    }


    public AgendaModel buscarPorId(Integer id){
        Optional<AgendaModel> optionalAgendaModel = AgendaRepository.findById(id);
        if (optionalAgendaModel.isEmpty()){
            throw new RuntimeException("Data não disponivel");
        }
        return optionalAgendaModel.get();
    }

    public void desmarcarConsulta(Integer id) {
        if (agendaRepository.existsById(id))
            agendaRepository.deleteById(id);
    }

    public List<AgendaModel> listarDatas(){
        return agendaRepository.findAll();
    }

}
