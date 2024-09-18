package br.com.lucas.projeto.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LG_PERFIL_USUARIO")
@Getter
@Setter
@NoArgsConstructor
public class PerfilUsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "ID_PERFIL")
    private PerfilEntity perfilEntity;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioEntity usuarioEntity;
}
