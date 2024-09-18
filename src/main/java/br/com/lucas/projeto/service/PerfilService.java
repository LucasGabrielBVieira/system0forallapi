package br.com.lucas.projeto.service;

import br.com.lucas.projeto.entities.PerfilEntity;
import br.com.lucas.projeto.entities.dto.PerfilDTO;
import br.com.lucas.projeto.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<PerfilDTO> findAll() {
        List<PerfilEntity> list = perfilRepository.findAll();
        return list.stream().map(PerfilDTO::new).toList();
    }

    public PerfilDTO findById(Long id) {
        Optional<PerfilEntity> perfilEntity = perfilRepository.findById(id);
        return perfilEntity.map(PerfilDTO::new).orElse(null);
    }

    public void inserir(PerfilDTO perfilDTO) {
        PerfilEntity perfilEntity = new PerfilEntity(perfilDTO);
        perfilRepository.save(perfilEntity);
    }

    public void update(PerfilDTO perfilDTO) {
        PerfilEntity perfilEntity = new PerfilEntity(perfilDTO);
        perfilRepository.save(perfilEntity);
    }

    public void delete(Long id) {
        Optional<PerfilEntity> perfil = perfilRepository.findById(id);
        perfil.ifPresent(perfilEntity -> perfilRepository.deleteById(id));
    }
}
