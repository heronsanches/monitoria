package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Semestre;

public class SemestreDAO {

public int insert(Semestre s){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"semestre values (?, ?, ?, ?)");
		
			preparedStatement.setDate(1, new Date(s.getData_inicio().getTime()));
			preparedStatement.setString(2, s.getAno_nominal());
			
			if(s.getData_fim() != null)
				preparedStatement.setDate(3, new Date(s.getData_fim().getTime()));
			else
				preparedStatement.setNull(3, java.sql.Types.NULL);
			
			preparedStatement.setString(4, s.getPeriodo_nominal());
			
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
