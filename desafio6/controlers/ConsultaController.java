package br.edusync.com.desafio6.controlers;
import br.edusync.com.desafio6.models.PacienteModel;
import br.edusync.com.desafio6.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ConsultaController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping(value = "/novo")
    public ResponseEntity novoPaciente(@RequestBody PacienteModel paciente){
        pacienteService.adicionar(paciente);
        return new ResponseEntity(pacienteService, HttpStatus.OK);
    }

    @GetMapping(value = "nome")
    public ResponseEntity listarPorNome(@RequestParam(defaultValue = "") String busca){
        return new ResponseEntity<>(pacienteService.listaTodos(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity listarTodos(){
        String busca = null;
        return new ResponseEntity<>(pacienteService.listaTodos().toArray(new String[]{busca}), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity listarPorId(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(pacienteService.buscarPorId(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity remover(@PathVariable Integer id){
        pacienteService.remover(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}



