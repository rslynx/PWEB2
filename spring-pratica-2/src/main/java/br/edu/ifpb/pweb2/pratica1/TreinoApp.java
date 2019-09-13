package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TreinoSpringConfig.class);
		
		TreinamentoIntf treinamento = context.getBean(TreinamentoIntf.class);
//		TreinamentoIntf treinamento2 = context.getBean(TreinamentoIntf.class);

		
		treinamento.fazTreinamento();
//		treinamento2.fazTreinamento();
		
		System.out.println(treinamento);
//		System.out.println(treinamento2);
		
		context.close();
	}

}
