package br.com.lucas.projeto.service;

import br.com.lucas.projeto.entities.RecursoEntity;
import br.com.lucas.projeto.entities.dto.RecursoDTO;
import br.com.lucas.projeto.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<RecursoDTO> findAll() {
         List<RecursoEntity> list = recursoRepository.findAll();
         return list.stream().map(RecursoDTO::new).toList();
    }

    public RecursoDTO findById(Long id) {
        Optional<RecursoEntity> object = recursoRepository.findById(id);
        return object.map(RecursoDTO::new).orElse(null);
    }

    public void insert(RecursoDTO object) {
        RecursoEntity newObject = new RecursoEntity(object);
        recursoRepository.save(newObject);
    }

    public void update(RecursoDTO object) {
        RecursoEntity newObject = new RecursoEntity(object);
        recursoRepository.save(newObject);
    }

    public void delete(Long id) {
        Optional<RecursoEntity> object = recursoRepository.findById(id);
        object.ifPresent(newObj -> recursoRepository.deleteById(id));
    }


}
