package br.edu.ifpb.pweb2.carrinho.model;

import java.util.Arrays;
import java.util.List;

/** Define um catï¿½logo on-line da livraria.
 * Num sistema real essa classe seria substituida por um SGBD.
 * @author Fred
 *
 */

public class Catalogo {

  private static Item[] itens =
    { new Item("hall001",
               "Core Servlets and JavaServer Pages" +
                 " de Marty Hall",
               "A referÃªncia definitiva sobre servlets " +
                 "e JSP da Prentice Hall e \n" +
                 "Sun Microsystems Press. A primeira ediÃ§Ã£o " +
                 "estÃ¡ disponÃ­vel em www.coreservlets.com.",
               210.00),
      new Item("kassem001",
               "Designing Enterprise Applications with JEE " +
                 "de Nicholas Kassem",
               "Aborda as principais tecnologias para  " +
                 "o desenvolvimento de aplicaÃ§Ãµes em JEE. " +
                 "EstÃ¡ disponÃ­vel integralmente no site da Sun na " +
                 "seÃ§Ã£o Java Blue Prints.",
               100.00),
      new Item("britt001",
               "Tomcat. The Definitive Guide by Jason Brittain",
               "Guia vital para o administrador e programador " +
                 "que utilizam o Jakarta Tomcat.",
               19.95),
      new Item("alur001",
               "JEE Patterns de Deepak Alur e outros",
               "Os autores definem um conjunto de padrÃµes " +
                 "para a plataforma JEE. " +
                 "Ideal para quem jÃ¡ programa em JEE " +
                 "e deseja melhorar a flexibilidade, " +
                 "a reutilizaÃ§Ã£o e a organizaÃ§Ã£o estrutural " +
                 "de suas aplicaÃ§Ãµes. Livro imprescindÃ­vel para " +
                 "programadores mais avanÃ§ados.", 
               95.00),
      new Item("geary001",
               "JSP AvanÃ§ado de " +
                 "David Geary",
               "Livro trÃ¡s dicas excelentes para programadores JSP. " +
                 "As dicas sÃ£o muito prÃ¡ticas e realmente Ãºteis. " +
                 "A versÃ£o traduzida Ã© uma droga! ",
               75.00)
    };

  public static Item getItem(String itemID) {
    Item item;
    if (itemID == null) {
      return(null);
    }
    for(int i=0; i<itens.length; i++) {
      item = itens[i];
      if (itemID.equals(item.getId())) {
        return(item);
      }
    }
    return(null);
  }
  
  public static List<Item> getItens() {
	  return Arrays.asList(itens);	  
  }
}
               
