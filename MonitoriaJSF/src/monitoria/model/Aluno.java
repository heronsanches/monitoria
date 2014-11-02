package monitoria.model;
/**
 * Database's relational model class
 */

public class Aluno {
	
	/**pk varchar(9) */
	private String matricula;
	
	/**varchar(11) not null*/
	private String cpf;
	
	/**varchar(100) not null */
	private String nome;
	

	//setters and getters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		

}
