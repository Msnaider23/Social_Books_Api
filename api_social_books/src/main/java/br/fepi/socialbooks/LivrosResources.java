package br.fepi.socialbooks;

import java.util.Arrays;
import java.util.List;

//anotaçoes trazem o 'import' automaticamente
//caso nao venha automaticamente basta fazer um Ctrl+Shift+0

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResources {
	
	//Adiciona o recurso. no valor se coloca /nome para acessar o recurso.
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro livro1 = new Livro("A arte da guerra");
		Livro livro2 = new Livro("O pequeno principe");
		Livro livro3 = new Livro("1984");
		
		Livro[] livros = {
				livro1,livro2,livro3
		};
		return Arrays.asList(livros);
	}

}
