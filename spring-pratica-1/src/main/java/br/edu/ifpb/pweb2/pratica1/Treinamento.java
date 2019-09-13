package br.edu.ifpb.pweb2.pratica1;

public class Treinamento implements TreinamentoIntf  {

	private TreinoIntf taisagorda;
	
	
	public Treinamento(TreinoIntf taisagorda) {
		super();
		this.taisagorda = taisagorda;
	}


	public Treinamento() {
		
	}


	public void fazTreinamento() {
		System.out.println("Vamos lá moçada, sem moleza!");
		System.out.println("Primeiro:");
		taisagorda.preparoFisico();
		System.out.println("Agora quero:");
		taisagorda.jogoTreino();
		System.out.println("Para terminar:");
		taisagorda.treinoTatico();
		
	}
	
	
	public TreinoIntf gettaisagorda() {
		return taisagorda;
	}


	public void settaisagorda(TreinoIntf taisagorda) {
		this.taisagorda = taisagorda;
	}


}
