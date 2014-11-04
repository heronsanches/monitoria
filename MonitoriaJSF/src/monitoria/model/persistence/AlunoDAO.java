package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import monitoria.model.Aluno;
import monitoria.model.DB;

public class AlunoDAO {
	
public int insert(Aluno a){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"aluno values (?, ?, ?)");
		
			preparedStatement.setString(1, a.getMatricula());
			preparedStatement.setString(2, a.getCpf());
			preparedStatement.setString(3, a.getNome());
			
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


public Aluno getAlunoByCpf(String cpf) {

	try {

		Statement statement = DB.getConnectionDB().createStatement();

		ResultSet resultSet = statement.executeQuery("select * from "
				+ "aluno where cpf='"+cpf+"'");

		Aluno a = null;
		
		if(resultSet.next()) {

			a = new Aluno();
			a.setCpf(resultSet.getString("cpf"));
			a.setMatricula(resultSet.getString("matricula"));
			a.setNome(resultSet.getString("nome"));
			
		}

		statement.close();
		return a;

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
