package bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="loginBean")
@RequestScoped
public class LoginBean {
	private String login;
	private String senha;
	
	
	
	public String autentique() {
		if (login.equals("admin") && senha.equals("changeit")) {
			return "sucesso?faces-redirect=true";
		}
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,
		new FacesMessage(FacesMessage.SEVERITY_ERROR,
		"Usuário e/ou senha inválidos.",
		"Verifique se CAPSLOCK está ativada."));
		return null; //volta para a pagina onde está

	}
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
