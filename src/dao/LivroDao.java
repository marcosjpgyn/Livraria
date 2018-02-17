package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Livro;
import util.FabricaConexao;

public class LivroDao {
	public Livro consultar(int codigo) {
		String buscaporId = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM LIVRO WHERE COD_LIVRO = ?";
		Livro livro = null;
		
		try {
			Connection conexao = FabricaConexao.getConexao();
			PreparedStatement ps = conexao.prepareStatement(buscaporId);
			
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				livro = new Livro();
				livro.setCodigo(rs.getInt("COD_LIVRO"));
				livro.setTitulo(rs.getString("TITULO"));
				livro.setAutor(rs.getString("AUTOR"));
				livro.setPreco(rs.getDouble("PRECO"));
				livro.setImagem(rs.getString("IMAGEM"));
				livro.setDescricao(rs.getString("DESCRICAO"));
				
				
			}
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}


	
	public List<Livro> consultarPorTítulo(String titulo) {
		String buscaPorTitulo = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM LIVRO WHERE TITULO LIKE ?";
		Livro livro = null;
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		try {
			Connection conexao = FabricaConexao.getConexao();
			PreparedStatement ps = conexao.prepareStatement(buscaPorTitulo);
			
			ps.setString(1, "%" + titulo.toUpperCase() + "%");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				livro = new Livro();
				livro.setCodigo(rs.getInt("COD_LIVRO"));
				livro.setTitulo(rs.getString("TITULO"));
				livro.setAutor(rs.getString("AUTOR"));
				livro.setPreco(rs.getDouble("PRECO"));
				livro.setImagem(rs.getString("IMAGEM"));
				livro.setDescricao(rs.getString("DESCRICAO"));
				lista.add(livro);
				
			}
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
