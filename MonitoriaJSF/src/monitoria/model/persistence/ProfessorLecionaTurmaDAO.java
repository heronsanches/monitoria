package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.ProfessorLecionaTurma;

public class ProfessorLecionaTurmaDAO {
	

public int insert(ProfessorLecionaTurma plt){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"professor_leciona_turma values (?, ?, ?, ?)");
		
			preparedStatement.setString(1, plt.getTurma_numero());
			preparedStatement.setString(2, plt.getTurma_disciplina_cod());
			preparedStatement.setDate(3, new Date(plt.getTurma_semestre_data_inicio().getTime()));
			preparedStatement.setString(4, plt.getProfessor_matricula());
						
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
