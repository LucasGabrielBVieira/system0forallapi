package br.com.lucas.projeto.repository;

import br.com.lucas.projeto.entities.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
