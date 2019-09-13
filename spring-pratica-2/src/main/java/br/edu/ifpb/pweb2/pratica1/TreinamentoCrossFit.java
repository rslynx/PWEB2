package br.edu.ifpb.pweb2.pratica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TreinamentoCrossFit implements TreinamentoIntf {
	
	private TreinoIntf treinoCross;
	
	public TreinamentoCrossFit() {
		
	}
	
	@Autowired
	public TreinamentoCrossFit(	@Qualifier("treinoFimTemporada") TreinoIntf treino) {
		super();
		this.treinoCross = treino;
	}

	@Override
	public void fazTreinamento() {
		System.out.println("Vamos lá moçada, sem moleza!");
		System.out.println("Primeiro:");
		treinoCross.preparoFisico();
		System.out.println("Agora quero:");
		treinoCross.jogoTreino();
		System.out.println("Para terminar:");
		treinoCross.treinoTatico();
		
	}
}
