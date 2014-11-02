package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.Bolsista;
import monitoria.model.DB;

public class BolsistaDAO {
	
	public  int insert(Bolsista b){

		int count = 0;
		PreparedStatement preparedStatement;
			
			try {
				
				preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
					"bolsista values (?, ?, ?, ?)");
				
				preparedStatement.setString(1, b.getMatricula());
				preparedStatement.setString(2, b.getConta_corrente());
				preparedStatement.setString(3, b.getAgencia());
				preparedStatement.setString(4, b.getBanco());

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
