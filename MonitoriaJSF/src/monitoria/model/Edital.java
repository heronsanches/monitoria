package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Edital {
	
	/**pk auto_increment*/
	private int cod;
	
	/**date not null, it represents the beginning of the inscricao
	 * for this edital*/
	private Date data_inicio;
	
	/**date not null, it represents the final of the inscricao 
	 * for this edital*/
	private Date data_fim;
	
	/**varchar(300) */
	private String informacoes_adicionais;
	
	/**varchar(150) not null */
	private String documentos_necessarios;
	
	
	//setters and getters
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

	public String getInformacoes_adicionais() {
		return informacoes_adicionais;
	}

	public void setInformacoes_adicionais(String informacoes_adicionais) {
		this.informacoes_adicionais = informacoes_adicionais;
	}

	public String getDocumentos_necessarios() {
		return documentos_necessarios;
	}

	public void setDocumentos_necessarios(String documentos_necessarios) {
		this.documentos_necessarios = documentos_necessarios;
	}

	public int getCod() {
		return cod;
	}


}
