package br.usjt.previsaodotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaodotempo.model.Usuario;

public interface UsuarioRepository 	extends	JpaRepository<Usuario,Long>
{	
 	public Usuario findOneByLoginAndSenha(String login, String senha);	
 	
}	

