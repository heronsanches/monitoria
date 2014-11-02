package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Turma {

	/**pk varchar(6)*/
	private String numero;
	
	/**fpk varchar(10) */
	private String disciplina_cod;
	
	/**fpk */
	private Date semestre_data_inicio;
	
	private Date data_inicio;
	private Date data_fim;
	
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDisciplina_cod() {
		return disciplina_cod;
	}
	public void setDisciplina_cod(String disciplina_cod) {
		this.disciplina_cod = disciplina_cod;
	}
	public Date getSemestre_data_inicio() {
		return semestre_data_inicio;
	}
	public void setSemestre_data_inicio(Date semestre_data_inicio) {
		this.semestre_data_inicio = semestre_data_inicio;
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
