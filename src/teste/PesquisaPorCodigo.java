package teste;

import dao.LivroDao;
import modelo.Livro;

public class PesquisaPorCodigo {

	public static void main(String[] args) {
		
		int codigo = 1;
         LivroDao dao = new LivroDao();
         
         Livro livro = dao.consultar(codigo);
         
         System.out.println("C�digo:" + livro.getCodigo());
         System.out.println("T�tulo:" + livro.getTitulo());
         System.out.println("Autor: " + livro.getAutor());
         System.out.println("Pre�o: " + livro.getPreco());
         System.out.println("Imagem: " + livro.getImagem());
	}

}
