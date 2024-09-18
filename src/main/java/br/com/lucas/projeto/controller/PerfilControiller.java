package br.com.lucas.projeto.controller;

import br.com.lucas.projeto.entities.dto.PerfilDTO;
import br.com.lucas.projeto.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
@CrossOrigin
public class PerfilControiller {

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public ResponseEntity<List<PerfilDTO>> findAll(){
        List<PerfilDTO> list = perfilService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilDTO> findById(@PathVariable Long id) {
        PerfilDTO perfilDTO = perfilService.findById(id);
        return ResponseEntity.ok().body(perfilDTO);
    }

    @PostMapping
    public void insert(@RequestBody PerfilDTO perfilDTO) {
        perfilService.inserir(perfilDTO);
    }

    @PutMapping
    public void update(@RequestBody PerfilDTO perfilDTO) {
        perfilService.update(perfilDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        perfilService.delete(id);
    }
}
