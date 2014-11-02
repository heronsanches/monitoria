package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Projeto;

public class ProjetoDAO {
	
public int insert(Projeto p){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"projeto values (default, ?, pg_catalog.bit(?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
			if(p.getEdital_cod() != 0)
				preparedStatement.setInt(1, p.getEdital_cod());
			else
				preparedStatement.setNull(1, java.sql.Types.NULL);
			
			preparedStatement.setString(2, p.isStatus());
			preparedStatement.setString(3, p.getAtividades_gerais());
			preparedStatement.setString(4, p.getDescricao());
			
			if(p.getData_aprovacao() != null)
				preparedStatement.setDate(5, new Date(p.getData_aprovacao().getTime()));
			else
				preparedStatement.setNull(5, java.sql.Types.NULL);

			if(p.getAta_aprovacao() != null)
				preparedStatement.setString(6, p.getAta_aprovacao());
			else
				preparedStatement.setNull(6, java.sql.Types.NULL);

			if(p.getInicio_vigencia() != null)
				preparedStatement.setDate(7, new Date(p.getInicio_vigencia().getTime()));
			else
				preparedStatement.setNull(7, java.sql.Types.NULL);

			if(p.getFim_vigencia() != null)
				preparedStatement.setDate(8, new Date(p.getFim_vigencia().getTime()));
			else
				preparedStatement.setNull(8, java.sql.Types.NULL);

			preparedStatement.setInt(9, p.getQtde_vagas());
			preparedStatement.setString(10, p.getTipo());
			preparedStatement.setString(11, p.getDisciplina_cod());
			preparedStatement.setString(12, p.getProfessor_matricula());

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
