package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import monitoria.model.DB;
import monitoria.model.Edital;

public class EditalDAO {
	
public int insert(Edital e){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"edital values (default, ?, ?, ?, ?)");
		
			preparedStatement.setDate(1, new Date(e.getData_inicio().getTime()));
			preparedStatement.setDate(2, new Date(e.getData_fim().getTime()));
			preparedStatement.setString(3, e.getInformacoes_adicionais());
			preparedStatement.setString(4, e.getDocumentos_necessarios());
			
			count = preparedStatement.executeUpdate(); // update
			preparedStatement.close();
		
		} catch (SQLException ee) {
			
			// TODO Auto-generated catch block
			ee.printStackTrace();
			
		} catch (Exception ee) {
			
			// TODO Auto-generated catch block
			ee.printStackTrace();
			
		}
		
		return count;
		
	}

}
