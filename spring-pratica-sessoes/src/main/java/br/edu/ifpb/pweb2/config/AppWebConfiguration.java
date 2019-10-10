package br.edu.ifpb.pweb2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import br.edu.ifpb.pweb2.carrinho.controller.CatalogoController;

@EnableWebMvc
@ComponentScan(basePackageClasses = { CatalogoController.class })
public class AppWebConfiguration  implements WebMvcConfigurer {

@Autowired
private ApplicationContext applicationContext;

/*
* PASSO 1 - Crie o SpringResourceTemplateResolver
*/
@Bean
public SpringResourceTemplateResolver templateResolver() {
SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
templateResolver.setApplicationContext(applicationContext);
templateResolver.setPrefix("/WEB-INF/views/");
templateResolver.setSuffix(".html");
return templateResolver;
}

/*
* PASSO 2 - Crie o SpringTemplateEngine
*/
@Bean
public SpringTemplateEngine templateEngine() {
SpringTemplateEngine templateEngine = new SpringTemplateEngine();
templateEngine.setTemplateResolver(templateResolver());
templateEngine.setEnableSpringELCompiler(true);
return templateEngine;
}

/*
* PASSO 3 - Register ThymeleafViewResolver
*/
@Override
public void configureViewResolvers(ViewResolverRegistry registry) {
ThymeleafViewResolver resolver = new ThymeleafViewResolver();
resolver.setTemplateEngine(templateEngine());
registry.viewResolver(resolver);
}

public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
configurer.enable();
}

}