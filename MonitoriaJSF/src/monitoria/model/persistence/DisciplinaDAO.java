package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Disciplina;

public class DisciplinaDAO {

	
	public int insert(Disciplina disciplina){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"disciplina values (?, ?, ?)");
		
			preparedStatement.setString(1, disciplina.getCod());
			preparedStatement.setString(2, disciplina.getNome());
			preparedStatement.setInt(3, disciplina.getDepartamento_cod());
			
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
	
	
	
	
}
