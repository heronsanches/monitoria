package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Inscricao;

public class InscricaoDAO {
	
public int insert(Inscricao i){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"inscricao values (default, ?, ?, ?, ?)");
		
			preparedStatement.setInt(1, i.getProjeto_cod());
			preparedStatement.setString(2, i.getAluno_matricula());
			preparedStatement.setDate(3, new Date(i.getData_inscricao().getTime()));

			if(i.getNota_processo_seletivo() != Inscricao.SEM_NOTA)
				preparedStatement.setDouble(4, i.getNota_processo_seletivo());
			else
				preparedStatement.setNull(4, java.sql.Types.NULL);
						
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
