package bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="msgBean")
@RequestScoped
public class MensagemBean {
	private String mensagem = "bem vindo ao JSF";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
