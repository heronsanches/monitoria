package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import monitoria.model.DB;
import monitoria.model.Inscricao;

public class InscricaoDAO {
	
public Inscricao insert(Inscricao i){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"inscricao values (?, ?, ?, default)");
		
			preparedStatement.setInt(1, i.getProjeto_cod());
			preparedStatement.setString(2, i.getAluno_matricula());
			preparedStatement.setDate(3, new Date(i.getData_inscricao().getTime()));
						
			count = preparedStatement.executeUpdate(); // update
			preparedStatement.close();
		
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
		
		if(count != 0)
			return i;
		else
			return null;
		
	}


/**se retornar diferente de null, significa que existe inscricao aberta para o aluno */
public Inscricao isAlunoInscricaoAberta(String matricula) {

	try {

		Statement statement = DB.getConnectionDB().createStatement();

		ResultSet resultSet = statement.executeQuery("select * from "
				+ "inscricao where aluno_matricula='"+matricula+"'");

		Inscricao i = null;
		
		while (resultSet.next()) {

			i = null;
			
			if(resultSet.getDouble("nota_processo_seletivo") == -1){
				
				i = new Inscricao();
				i.setAluno_matricula(resultSet.getString("aluno_matricula"));
				i.setData_inscricao(resultSet.getDate("data_inscricao"));
				i.setNota_processo_seletivo(resultSet.getDouble("nota_processo_seletivo"));
				i.setProjeto_cod(resultSet.getInt("projeto_cod"));
				return i;
				
			}
			
		}

		statement.close();
		return i;

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
