package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.Bolsa;
import monitoria.model.DB;

public class BolsaDAO {
	
public int insert(Bolsa b){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"bolsa values (default, ?, ?, ?, ?)");
		
			System.out.println(b.getInicio_vigencia().getTime());
			preparedStatement.setDate(1, new Date(b.getInicio_vigencia().getTime()));
			preparedStatement.setDate(2, new Date(b.getFim_vigencia().getTime()));
			preparedStatement.setDouble(3, b.getValor());
			preparedStatement.setInt(4, b.getProjeto_cod());
			
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
