package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Inscricao {
	
	/**pk integer auto_increment */
	private int numero;
	
	/**pfk integer of projeto */
	private int projeto_cod;
	
	/**pfk varchar(9) of aluno */
	private String aluno_matricula;
	
	/**date not null */
	private Date data_inscricao;
	
	/**decimal(4,2) */
	private double nota_processo_seletivo;
	
	public static final double SEM_NOTA = -1;
	
	
	//setters and getters
	public int getProjeto_cod() {
		return projeto_cod;
	}

	public void setProjeto_cod(int projeto_cod) {
		this.projeto_cod = projeto_cod;
	}

	public String getAluno_matricula() {
		return aluno_matricula;
	}

	public void setAluno_matricula(String aluno_matricula) {
		this.aluno_matricula = aluno_matricula;
	}

	public Date getData_inscricao() {
		return data_inscricao;
	}

	public void setData_inscricao(Date data_inscricao) {
		this.data_inscricao = data_inscricao;
	}

	public double getNota_processo_seletivo() {
		return nota_processo_seletivo;
	}

	public void setNota_processo_seletivo(double nota_processo_seletivo) {
		this.nota_processo_seletivo = nota_processo_seletivo;
	}

	public int getNumero() {
		return numero;
	}	

}
