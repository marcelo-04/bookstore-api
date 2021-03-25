package com.marcelo.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.bookstore.domain.Categoria;
import com.marcelo.bookstore.domain.Livro;
import com.marcelo.bookstore.repositories.CategoriaRepository;
import com.marcelo.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Programação", "Livro de Programação");
		Categoria cat3 = new Categoria(null, "Ficção Cientifica", "Ficção Cientifica");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de SoftWare", "Louis V. Gerstner", "Loren ipsum", cat2);
		Livro l3 = new Livro(null, "The Time Machine", "H.G. Welss", "Lorem ipsum", cat3);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Welss", "Lorem ipsum", cat3);
		Livro l5 = new Livro(null, "Desbravando", "Casa do Código", "Rodrigo Turini", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

	}

}
