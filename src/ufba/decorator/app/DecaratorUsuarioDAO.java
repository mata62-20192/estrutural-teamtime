package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;

public abstract class DecaratorUsuarioDAO implements UsuarioDAO {
	
	protected UsuarioDAO usuarioDAO;
	
	protected DecaratorUsuarioDAO (UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	@Override
	public void apagarTudo() {
		usuarioDAO.apagarTudo();
	}

	@Override
	public void inserir(Usuario u) {
		usuarioDAO.inserir(u);
	}

	@Override
	public Usuario obter(String username) {
		return usuarioDAO.obter(username);
	}

}
