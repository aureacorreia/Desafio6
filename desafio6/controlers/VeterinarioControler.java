package br.edusync.com.desafio6.controlers;

import br.edusync.com.desafio6.models.VeterinarioModel;
import br.edusync.com.desafio6.services.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class VeterinarioControler {

    @Autowired
    private VeterinarioService veterinarioService;

    @PostMapping
    public ResponseEntity adicionarMedico(@RequestBody VeterinarioModel medicoModel) {
        VeterinarioService.adicionar(medicoModel);
        return new ResponseEntity(medicoModel, HttpStatus.CREATED);
    }


    @GetMapping
    public RestController listarTudo(){
        return (RestController) new ResponseEntity<>(veterinarioService.listarTudo(), HttpStatus.OK);
    }

    public ResponseEntity<VeterinarioModel> ResponseEntity  (@RequestParam Integer id){
        return new ResponseEntity<>(veterinarioService.buscarPorId(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity remover() {
        return remover(null);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity remover(@PathVariable Integer id){
        veterinarioService.remover(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}



