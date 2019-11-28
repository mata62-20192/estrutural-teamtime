package ufba.composite;

import java.util.ArrayList;

public class MembroComposite extends Membro {

	private ArrayList<Membro> membros = new ArrayList<>();
	
	public void add(Membro membro) {
		membros.add(membro);
	}

	public void remove(Membro membro) {
		membros.remove(membro);
	}
	public Membro getMembro(String nome) {
		for(Membro tempMembro: membros)
			if (tempMembro.getNome().equals(nome))
				return tempMembro;
		return null;
	}
	
	public double getSalario() {
		double sum = 0;
		for(Membro tempMembro: membros)
			sum += tempMembro.getSalario();
		return sum;
	}

}
