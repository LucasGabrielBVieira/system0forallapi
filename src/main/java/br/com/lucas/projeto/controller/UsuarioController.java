package br.com.lucas.projeto.controller;

import br.com.lucas.projeto.entities.dto.UsuarioDTO;
import br.com.lucas.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		return ResponseEntity.ok().body(usuarioService.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<UsuarioDTO> findById(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(usuarioService.findById(id));
	}

	@PostMapping
	public void insert(@RequestBody UsuarioDTO usuarioDTO) {
		usuarioService.insert(usuarioDTO);
	}

	@PutMapping
	public void update(@RequestBody UsuarioDTO usuarioDTO) {
		usuarioService.update(usuarioDTO);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
