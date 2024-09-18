package br.com.lucas.projeto.repository;

import br.com.lucas.projeto.entities.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {
}
