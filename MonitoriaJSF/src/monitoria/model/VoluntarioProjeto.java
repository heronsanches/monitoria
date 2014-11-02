package monitoria.model;

import java.util.Date;

public class VoluntarioProjeto {
	
	/**pfk of projeto integer*/
	private int projeto_cod;

	/**pfk of voluntario varchar(9)*/
	private String voluntario_matricula;
	
	/**date not null */
	private Date data_inicio;
	
	/**date not null*/
	private Date data_fim;

	
	//setters and getters
	public int getProjeto_cod() {
		return projeto_cod;
	}

	public void setProjeto_cod(int projeto_cod) {
		this.projeto_cod = projeto_cod;
	}

	public String getVoluntario_matricula() {
		return voluntario_matricula;
	}

	public void setVoluntario_matricula(String voluntario_matricula) {
		this.voluntario_matricula = voluntario_matricula;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	
}
