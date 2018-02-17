package util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
      
	
		
		try {
			Connection con = FabricaConexao.getConexao();
			if(con != null) 
				System.out.println("Conexão estabelecida com sucesso");
				con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
