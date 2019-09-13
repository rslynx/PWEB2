package br.edu.ifpb.pweb2.pratica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Treinamento implements TreinamentoIntf  {
	
	@Autowired
	@Qualifier("treinoMeioTemporada")
	private TreinoIntf treino;
	
	
	public Treinamento(TreinoIntf treino) {
		super();
		this.treino = treino;
	}


	public Treinamento() {
		
	}


	public void fazTreinamento() {
		System.out.println("Vamos lá moçada, sem moleza!");
		System.out.println("Primeiro:");
		treino.preparoFisico();
		System.out.println("Agora quero:");
		treino.jogoTreino();
		System.out.println("Para terminar:");
		treino.treinoTatico();
		
	}
	
	
	public TreinoIntf gettreino() {
		return treino;
	}

	public void settreino(TreinoIntf treino) {
		this.treino = treino;
	}


}
