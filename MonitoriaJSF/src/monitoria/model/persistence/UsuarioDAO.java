package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import monitoria.model.DB;
import monitoria.model.Usuario;

public class UsuarioDAO {
	
public int insert(Usuario u){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"usuario values (?, ?, default)");
		
			preparedStatement.setString(1, u.getCpf());
			preparedStatement.setString(2, u.getSenha());
			//preparedStatement.setString(3, u.getAdministrador());
			
			count = preparedStatement.executeUpdate(); // update
			preparedStatement.close();
		
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return count;
		
	}


public Usuario getOne(Usuario u) {

	try {

		Statement statement = DB.getConnectionDB().createStatement();

		ResultSet resultSet = statement.executeQuery("select * from "
				+ "usuario where cpf='"+u.getCpf()+"' "
				+"and senha='"+u.getSenha()+"'");

		u = null;
		if (resultSet.next()) {

			u = new Usuario();
			u.setCpf(resultSet.getString("cpf"));
			u.setSenha(resultSet.getString("senha"));
			u.setAdministrador(resultSet.getString("administrador"));

		}

		statement.close();
		return u;

	} catch (SQLException e) {

		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;

	} catch (Exception e) {

		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;

	}

}

}
