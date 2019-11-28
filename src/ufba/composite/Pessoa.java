package ufba.composite;

public abstract class Pessoa extends Membro {
	double experiencia;
	
	public double getExperiencia() {
		return this.experiencia;
	}
	
	public abstract double getSalario();
}