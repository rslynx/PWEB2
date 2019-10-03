package br.edu.ifpb.pweb2.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.edu.ifpb.pweb2.model.Aluno;

public class LivroRepository {

	public static Map<Long, Aluno> repositorio = new HashMap<Long, Aluno>();
	
	public static Aluno findById(Long id){
		return repositorio.get(id);
	}
	
	public static void store(Aluno livro) {
		repositorio.put(livro.getId(), livro);
	}
	
	public static List<Aluno> findAll(){
		List<Aluno> livros = repositorio.values().stream().collect(Collectors.toList());
		return livros;
	}
	
}
