package ufba.composite;

public abstract class Membro {
	String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract double getSalario();
}
