package monitoria.model.persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import monitoria.model.DB;
import monitoria.model.Horario;

public class HorarioDAO {

public int insert(Horario horario){
		
		int count = 0;

		try {
			
			PreparedStatement preparedStatement = DB.getConnectionDB().prepareStatement("insert into " +
				"horario values (default, ?, ?, pg_catalog.bit(?), pg_catalog.bit(?), pg_catalog.bit(?),"
				+ " pg_catalog.bit(?), pg_catalog.bit(?), pg_catalog.bit(?))");
		
			preparedStatement.setTime(1, new Time(horario.getHora_inicio().getTime()));
			preparedStatement.setTime(2, new Time(horario.getHora_fim().getTime()));
			preparedStatement.setString(3, horario.isSeg());
			preparedStatement.setString(4, horario.isTer());
			preparedStatement.setString(5, horario.isQua());
			preparedStatement.setString(6, horario.isQui());
			preparedStatement.setString(7, horario.isSex());
			preparedStatement.setString(8, horario.isSab());
			
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
