package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Professor;

public class ProfessorDAO {

public int insert(Professor p){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"professor values (?, ?, ?, ?, ?)");
		
			preparedStatement.setString(1, p.getMatricula());
			preparedStatement.setString(2, p.getCpf());
			preparedStatement.setString(3, p.getNome());
			preparedStatement.setString(4, p.getRegime());
			preparedStatement.setInt(5, p.getDepartamento_cod());
			
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
