package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class BolsaPertenceBolsista {

	/** pfk of bolsa integer*/
	private int bolsa_cod;
	
	/**pfk of bolsista varchar(9)*/
	private String bolsista_matricula;
	
	/**date not null */
	private Date data_inicio;
	
	/**date not null */
	private Date data_fim;

	
	//setters and getters
	public int getBolsa_cod() {
		return bolsa_cod;
	}

	public void setBolsa_cod(int bolsa_cod) {
		this.bolsa_cod = bolsa_cod;
	}

	public String getBolsista_matricula() {
		return bolsista_matricula;
	}

	public void setBolsista_matricula(String bolsista_matricula) {
		this.bolsista_matricula = bolsista_matricula;
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
