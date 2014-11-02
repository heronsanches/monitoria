package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Relatorio {
	
	/**pk integer autoincrement*/
	private int cod;
	
	/**date not null */
	private Date data_criacao;
	
	/**date, it shows the date of departamento's approved */
	private Date data_aprovacao;
	
	/**varchar(300) not null, it shows the path of this file */
	private String arquivo_relatorio;
	
	/**varchar(1) not null, tipo can be relatorio_professor and
	 * relatorio_monitor.
	 */
	private String tipo;
	
	/**decimal(2), only relatorio do tipo relatorio_proessor
	 * pode ter este atributo */
	private double nota_conceito;
	
	/**varchar(200) not null */
	private String descricao;
	
	/**varchar(300) it shows the path of this file*/
	private String ata_aprovacao;
	
	/**fk of projeto not null*/
	private int projeto_cod;
	
	
	//setters and getters
	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Date getData_aprovacao() {
		return data_aprovacao;
	}

	public void setData_aprovacao(Date data_aprovacao) {
		this.data_aprovacao = data_aprovacao;
	}

	public String getArquivo_relatorio() {
		return arquivo_relatorio;
	}

	public void setArquivo_relatorio(String arquivo_relatorio) {
		this.arquivo_relatorio = arquivo_relatorio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getNota_conceito() {
		return nota_conceito;
	}

	public void setNota_conceito(double nota_conceito) {
		this.nota_conceito = nota_conceito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAta_aprovacao() {
		return ata_aprovacao;
	}

	public void setAta_aprovacao(String ata_aprovacao) {
		this.ata_aprovacao = ata_aprovacao;
	}

	public int getProjeto_cod() {
		return projeto_cod;
	}

	public void setProjeto_cod(int projeto_cod) {
		this.projeto_cod = projeto_cod;
	}

	public int getCod() {
		return cod;
	}
	
	
}
