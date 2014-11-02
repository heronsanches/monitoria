package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.TurmaPossuiHorario;

public class TurmaPossuiHorarioDAO {
	
public int insert(TurmaPossuiHorario tph){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"turma_possui_horario values (?, ?, ?, ?)");
		
			preparedStatement.setString(1, tph.getNumero());
			preparedStatement.setString(2, tph.getDisciplina_cod());
			preparedStatement.setDate(3, new Date(tph.getSemestre_data_inicio().getTime()));
			preparedStatement.setInt(4, tph.getCod());
					
			count = preparedStatement.executeUpdate();
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
