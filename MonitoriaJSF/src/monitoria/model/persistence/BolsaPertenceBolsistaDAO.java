package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.BolsaPertenceBolsista;
import monitoria.model.DB;

public class BolsaPertenceBolsistaDAO {
	
	public  int insert(BolsaPertenceBolsista b){

		int count = 0;
		PreparedStatement preparedStatement;
			
			try {
				
				preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
					"bolsa_pertence_bolsista values (?, ?, ?, ?)");
				
				preparedStatement.setInt(1, b.getBolsa_cod());
				preparedStatement.setString(2, b.getBolsista_matricula());
				preparedStatement.setDate(3, new Date(b.getData_inicio().getTime()));
				preparedStatement.setDate(4, new Date(b.getData_fim().getTime()));

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
