package monitoria.model;

/**
 * Database's relational model class
 */

public class Bolsista {
	
	/**pfk varchar(9) of aluno */
	private String matricula;
	
	/**varchar(14) not null */
	private String conta_corrente;
	
	/**varchar(9) not null*/
	private String agencia;
	
	/**varchar(30) not null */
	private String banco;
	

	//setters and getters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getConta_corrente() {
		return conta_corrente;
	}

	public void setConta_corrente(String conta_corrente) {
		this.conta_corrente = conta_corrente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	

}
