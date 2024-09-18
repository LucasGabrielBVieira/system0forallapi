package br.com.lucas.projeto.entities;

import br.com.lucas.projeto.entities.dto.PerfilDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name="LG_PERFIL")

public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    public PerfilEntity(PerfilDTO perfilDto) {
        BeanUtils.copyProperties(perfilDto, this);
    }
}
