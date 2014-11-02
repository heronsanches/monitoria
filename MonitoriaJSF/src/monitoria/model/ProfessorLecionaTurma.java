package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class ProfessorLecionaTurma {
	
	/** pfk varchar(6) of turma*/
	private String turma_numero;
	
	/** pfk varchar(10) of turma */
	private String turma_disciplina_cod;
	
	/**pfk date of turma */
	private Date turma_semestre_data_inicio;
	
	/**pfk varchar(15) */
	private String professor_matricula;
	
	
	//setters and getters
	public String getTurma_numero() {
		return turma_numero;
	}

	public void setTurma_numero(String turma_numero) {
		this.turma_numero = turma_numero;
	}

	public String getTurma_disciplina_cod() {
		return turma_disciplina_cod;
	}

	public void setTurma_disciplina_cod(String turma_disciplina_cod) {
		this.turma_disciplina_cod = turma_disciplina_cod;
	}

	public Date getTurma_semestre_data_inicio() {
		return turma_semestre_data_inicio;
	}

	public void setTurma_semestre_data_inicio(Date turma_semestre_data_inicio) {
		this.turma_semestre_data_inicio = turma_semestre_data_inicio;
	}

	public String getProfessor_matricula() {
		return professor_matricula;
	}

	public void setProfessor_matricula(String professor_matricula) {
		this.professor_matricula = professor_matricula;
	}
		

}
