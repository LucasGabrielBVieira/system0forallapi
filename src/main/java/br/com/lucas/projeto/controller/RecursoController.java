package br.com.lucas.projeto.controller;

import br.com.lucas.projeto.entities.dto.RecursoDTO;
import br.com.lucas.projeto.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/recurso")
@CrossOrigin
public class RecursoController {

    @Autowired
    private RecursoService service;

    @GetMapping
    public ResponseEntity<List<RecursoDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursoDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public void insert(@RequestBody RecursoDTO recursoDTO) {
        service.insert(recursoDTO);
    }

    @PutMapping
    public void update(@RequestBody RecursoDTO recursoDTO) {
        service.update(recursoDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
