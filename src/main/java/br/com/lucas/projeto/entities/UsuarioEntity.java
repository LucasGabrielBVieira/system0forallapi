package br.com.lucas.projeto.entities;

import br.com.lucas.projeto.entities.dto.UsuarioDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "LG_USUARIO")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false, unique = true)
	private String login;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String email;

	public UsuarioEntity(UsuarioDTO usuario) {
		BeanUtils.copyProperties(usuario, this);
	}

	public UsuarioEntity(Long id, String name, String password, String login, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.login = login;
		this.email = email;
	}

	public UsuarioEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsuarioEntity that = (UsuarioEntity) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
