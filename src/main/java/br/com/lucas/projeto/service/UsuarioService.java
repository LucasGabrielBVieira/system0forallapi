package br.com.lucas.projeto.service;

import br.com.lucas.projeto.entities.UsuarioEntity;
import br.com.lucas.projeto.entities.dto.UsuarioDTO;
import br.com.lucas.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioDTO> findAll() {
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();
	}

	public UsuarioDTO findById(Long id) {
		Optional<UsuarioEntity> usuario = usuarioRepository.findById(id);
		return usuario.map(UsuarioDTO::new).orElse(null);
	}

	public void insert(UsuarioDTO usuarioDTO) {
		UsuarioEntity usuario = new UsuarioEntity(usuarioDTO);
		usuarioRepository.save(usuario);
	}

	public void update(UsuarioDTO usuarioDTO) {
		UsuarioEntity usuario = new UsuarioEntity(usuarioDTO);
		usuarioRepository.save(usuario);
	}

	public void delete(Long id) {
		Optional<UsuarioEntity> usuario = usuarioRepository.findById(id);
		usuario.ifPresent(usuarioEntity -> usuarioRepository.deleteById(usuarioEntity.getId()));
	}
}
