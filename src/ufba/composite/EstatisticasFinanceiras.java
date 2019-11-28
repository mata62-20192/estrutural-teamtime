package ufba.composite;

public class EstatisticasFinanceiras {
	// Custo de uma EUquipe
	public static void imprimeCustoProjeto(Membro pessoa) {
		System.out.println("Custo de " + pessoa.getNome() + ": " + pessoa.getSalario());
	}
	
	// Custo de uma equipe com várias pessoas
//	public static void imprimeCustoProjeto(Equipe equipe) {
//		System.out.println("Custo de " + equipe.getNome() + ": " + + equipe.getCustoMensal());
//	}
}