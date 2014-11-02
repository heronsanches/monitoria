package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import monitoria.model.DB;
import monitoria.model.Turma;

public class TurmaDAO {
	

public int insert(Turma t){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"turma values (?, ?, ?, ?, ?)");
		
			preparedStatement.setString(1, t.getNumero());
			preparedStatement.setString(2, t.getDisciplina_cod());
			preparedStatement.setDate(3, new Date(t.getSemestre_data_inicio().getTime()));
			
			if(t.getData_inicio() == null)
				preparedStatement.setNull(4, Types.NULL);
			else
				preparedStatement.setDate(4, new Date(t.getData_inicio().getTime()));
			
			if(t.getData_fim() == null)
				preparedStatement.setNull(5, Types.NULL);
			else
				preparedStatement.setDate(5, new Date(t.getData_fim().getTime()));
					
			
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
