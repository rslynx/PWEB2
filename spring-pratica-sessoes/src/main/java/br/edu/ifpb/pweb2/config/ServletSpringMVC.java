package br.edu.ifpb.pweb2.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends
AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null; 
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Classe que configurará os demais passos
		return new Class[] {AppWebConfiguration.class};
	}
	@Override
	protected String[] getServletMappings() {
		// Passo 2 da configuração
		return new String[] {"/"};
	}
}