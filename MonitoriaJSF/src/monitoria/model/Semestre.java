package monitoria.model;
/**
 * Database's relational model class
 */

import java.util.Date;

public class Semestre {

	/** pk*/
	private Date data_inicio;
	
	/** varchar(4) not null
	 * um semestre pode começar em 2014, mas ser equivalente
	 * a 2013.1, por exemplo*/
	private String ano_nominal;

	private Date data_fim;
	
	/**varchar(1) pode ser somente 1 ou 2*/
	private String periodo_nominal;
	

	//getters and setters
	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getAno_nominal() {
		return ano_nominal;
	}

	public void setAno_nominal(String ano_nominal) {
		this.ano_nominal = ano_nominal;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getPeriodo_nominal() {
		return periodo_nominal;
	}

	public void setPeriodo_nominal(String periodo_nominal) {
		this.periodo_nominal = periodo_nominal;
	}

	
	
}
