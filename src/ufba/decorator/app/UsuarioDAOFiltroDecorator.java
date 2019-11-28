package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;

public class UsuarioDAOFiltroDecorator extends DecaratorUsuarioDAO {

	protected UsuarioDAOFiltroDecorator(UsuarioDAO usuarioDAO) {
		super(usuarioDAO);
	}
	
	@Override
	public void inserir(Usuario u) {
		if (UsuarioUtils.ehValido(u))
			usuarioDAO.inserir(u);
		else
			usuarioDAO.inserir(UsuarioUtils.filtraEntrada(u));
	}
	
	@Override
	public Usuario obter(String username) {
		Usuario ret = usuarioDAO.obter(username);
		if (UsuarioUtils.ehValido(ret))
			return ret;
		else
			return UsuarioUtils.filtraEntrada(ret);
	}

}
