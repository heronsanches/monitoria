package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class TurmaPossuiHorario {
	
	/**fpk de turma varchar(6)*/
	private String numero;
	
	/**fpk de turma varchar(10)*/
	private String disciplina_cod;
	
	/**fpk de turma*/
	private Date semestre_data_inicio;
	
	
	/**fpk de horario*/
	private int cod;
	

	//setters and getters
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


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
	

}
