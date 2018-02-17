package teste;

import java.util.List;

import dao.LivroDao;
import modelo.Livro;



public class PesquisaPorTitulo {

	public static void main(String[] args) {
        String titulo = "MA";
        
        LivroDao dao = new LivroDao();
        
        List<Livro> livros = dao.consultarPorT�tulo(titulo);
        
        for(Livro livro : livros) {
        	
        	System.out.println("C�digo: " + livro.getCodigo());
        	System.out.println("T�tulo: " + livro.getTitulo());
        	System.out.println("Autor: " + livro.getAutor());
        	System.out.println("Pre�o: " + livro.getPreco());
        	System.out.println("Imagem: " + livro.getImagem());
        	System.out.println();
        	
        	
        }
	}

}
