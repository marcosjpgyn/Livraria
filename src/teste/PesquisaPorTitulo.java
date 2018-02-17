package teste;

import java.util.List;

import dao.LivroDao;
import modelo.Livro;



public class PesquisaPorTitulo {

	public static void main(String[] args) {
        String titulo = "MA";
        
        LivroDao dao = new LivroDao();
        
        List<Livro> livros = dao.consultarPorTítulo(titulo);
        
        for(Livro livro : livros) {
        	
        	System.out.println("Código: " + livro.getCodigo());
        	System.out.println("Título: " + livro.getTitulo());
        	System.out.println("Autor: " + livro.getAutor());
        	System.out.println("Preço: " + livro.getPreco());
        	System.out.println("Imagem: " + livro.getImagem());
        	System.out.println();
        	
        	
        }
	}

}
