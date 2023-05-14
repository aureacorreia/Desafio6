package br.edusync.com.desafio6.controlers;

import br.edusync.com.desafio6.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AgendaControler {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping(value = "/agenda/marcarconsulta")
    public ResponseEntity marcarConsulta(@RequestBody ConsultaService consultaService,
                                      @RequestParam Integer id) {
        consultaService.marcarConsulta(consultaService);
        return new ResponseEntity(consultaService + " " + id, HttpStatus.CREATED);
    }



    @GetMapping(value = "/agenda/listar")
    public ResponseEntity listarTodos(){
        return new ResponseEntity(consultaService.listarDatas(),HttpStatus.OK);

    }

    @DeleteMapping(value = "/desmarcar/{id}")
    public ResponseEntity desmarcar(@PathVariable Integer id){
        consultaService.desmarcarConsulta(id);
        return  new ResponseEntity(HttpStatus.OK);
    }

}
