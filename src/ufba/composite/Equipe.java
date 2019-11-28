package ufba.composite;

import java.util.ArrayList;

public class Equipe extends Membro {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	ArrayList<Equipe> subequipes = new ArrayList<Equipe>();
	
	public Equipe(String nome) {
		this.nome = nome;
	}
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	public void addSubequipe(Equipe subequipe) {
		subequipes.add(subequipe);
	}
	
	public double getCustoMensal() {
		double total = 0;
		for (Pessoa pessoa : pessoas) {
			total += pessoa.getSalario();
		}
		for (Equipe subequipe : subequipes) {
			total += subequipe.getCustoMensal();
		}
		return total;
	}
	
	@Override
	public double getSalario() {
		return getCustoMensal();
	}
	
}