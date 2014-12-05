package monitoria.model.persistence;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

public List<Edital> getOpened() {

	try {

		Statement statement = DB.getConnectionDB().createStatement();

		ResultSet resultSet = statement.executeQuery("select * from "
				+ "edital where data_fim > '1975-09-01'");

		Edital e = null;
		List<Edital> le = new ArrayList<Edital>();
		
		while (resultSet.next()) {

			e = new Edital();
			e.setCod(resultSet.getInt("cod"));
			e.setData_fim(resultSet.getDate("data_fim"));
			e.setData_inicio(resultSet.getDate("data_inicio"));
			e.setDocumentos_necessarios(resultSet.getString("documentos_necessarios"));
			e.setInformacoes_adicionais(resultSet.getString("informacoes_adicionais"));
			le.add(e);

		}

		statement.close();
		return le;

	} catch (SQLException e) {

		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;

	} catch (Exception e) {

		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;

	}

}


}
