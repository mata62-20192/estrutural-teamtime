package ufba.decorator.app;

import ufba.decorator.lib.*;

public class Main {
	public static void main(String[] args) {
		UsuarioDAO usuario = new UsuarioDAOAutenticacaoDecorator(new UsuarioDAOFiltroDecorator(new UsuarioMemoriaDAO()), "192.168.0.100");
		usuario.inserir(Usuario.fromString("a,a,a"));
		usuario.obter("a").getUsername();
		usuario.apagarTudo();
	}
}
