package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Projeto {
	
	/**pk integer auto_increment */
	private int cod;
	
	/**fk integer*/
	private int edital_cod;
	
	/**boolean/postgrresq-string bit(1) not null, it shows the approved status of this project by ufba */
	private String status;
	
	/**varchar(400) not null*/
	private String atividades_gerais;
	
	/**varchar(150) not null*/
	private String descricao;
	
	/**date, it shows the date of approved of the projeto by department*/
	private Date data_aprovacao;
	
	/**varchar(300), it is the file's path of the ata */
	private String ata_aprovacao;
	
	/**date, it shows the beginning of the project after accepted by ufba */
	private Date inicio_vigencia;
	
	/**date, it shows the validity of the project, the maximum of during is 24 months.
	 * Depending the type of offer of a specific disciplina. If the project is for disciplina of 12 months,
	 * the renew can be made each 12 month (changing {@link Projeto#fim_vigencia})
	 * If the discipline is offer a semester yes, other no, the renew can be happened each 6 months.
	 * The renew only happened if the professor of this discipline is the same that made the project.
	 *  */
	private Date fim_vigencia;
	
	/**integer not null, it shows the quantity of vacancies after approved by ufba */
	private int qtde_vagas;
	
	/**varchar(1) not null, it says if the project is for a disciplina of offer semester or
	 * only a once in a year
	 * A = annual project, the discipline is offered each semester
	 * S = semester project, the discipline is offered only a once in a year */
	private String tipo;
	
	/**fk of disciplina varchar(10) not null*/
	private String disciplina_cod;
	
	/**fk of professor varchar(15) not null*/
	private String professor_matricula;
	
	
	//setters and getters
	public int getEdital_cod() {
		return edital_cod;
	}

	public void setEdital_cod(int edital_cod) {
		this.edital_cod = edital_cod;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAtividades_gerais() {
		return atividades_gerais;
	}

	public void setAtividades_gerais(String atividades_gerais) {
		this.atividades_gerais = atividades_gerais;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_aprovacao() {
		return data_aprovacao;
	}

	public void setData_aprovacao(Date data_aprovacao) {
		this.data_aprovacao = data_aprovacao;
	}

	public String getAta_aprovacao() {
		return ata_aprovacao;
	}

	public void setAta_aprovacao(String ata_aprovacao) {
		this.ata_aprovacao = ata_aprovacao;
	}

	public Date getInicio_vigencia() {
		return inicio_vigencia;
	}

	public void setInicio_vigencia(Date inicio_vigencia) {
		this.inicio_vigencia = inicio_vigencia;
	}

	public Date getFim_vigencia() {
		return fim_vigencia;
	}

	public void setFim_vigencia(Date fim_vigencia) {
		this.fim_vigencia = fim_vigencia;
	}

	public int getQtde_vagas() {
		return qtde_vagas;
	}

	public void setQtde_vagas(int qtde_vagas) {
		this.qtde_vagas = qtde_vagas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDisciplina_cod() {
		return disciplina_cod;
	}

	public void setDisciplina_cod(String disciplina_cod) {
		this.disciplina_cod = disciplina_cod;
	}

	public String getProfessor_matricula() {
		return professor_matricula;
	}

	public void setProfessor_matricula(String professor_matricula) {
		this.professor_matricula = professor_matricula;
	}

	public int getCod() {
		return cod;
	}	
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	

}
