package br.com.lucas.projeto.entities.dto;

import br.com.lucas.projeto.entities.PerfilEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PerfilDTO {

    private Long id;
    private String descricao;

    public PerfilDTO(PerfilEntity perfilEntity) {
        BeanUtils.copyProperties(perfilEntity, this);
    }

}
