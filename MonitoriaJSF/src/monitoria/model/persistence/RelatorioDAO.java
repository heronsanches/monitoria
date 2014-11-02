package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import monitoria.model.DB;
import monitoria.model.Relatorio;

public class RelatorioDAO {
	
public int insert(Relatorio r){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"relatorio values (default, ?, ?, ?, ?, ?, ?, ?, ?)");
		
			preparedStatement.setDate(1, new Date(r.getData_criacao().getTime()));

			if(r.getData_aprovacao() == null)
				preparedStatement.setNull(2, Types.NULL);
			else
				preparedStatement.setDate(2, new Date(r.getData_aprovacao().getTime()));
			
			preparedStatement.setString(3, r.getArquivo_relatorio());
			preparedStatement.setString(4, r.getTipo());
			
			if(r.getNota_conceito() == 0.0)
				preparedStatement.setNull(5, Types.NULL);
			else
				preparedStatement.setDouble(5, r.getNota_conceito());

			preparedStatement.setString(6, r.getDescricao());
			
			if(r.getAta_aprovacao() == null)
				preparedStatement.setNull(7, Types.NULL);
			else
				preparedStatement.setString(7, r.getAta_aprovacao());
			
			preparedStatement.setInt(8, r.getProjeto_cod());
			
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
