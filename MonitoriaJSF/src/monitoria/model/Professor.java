package monitoria.model;
/**
 * Database's relational model class
 */

public class Professor {
	
	/**pk varchar(15)*/
	private String matricula;
	
	/** varchar(11) not null*/
	private String cpf;
	
	/** varchar(100) not null*/
	private String nome;
	
	/** varchar(3) not null, DE, 20H, 40H*/
	private String regime;
	
	/** fk not null*/
	private int departamento_cod;
	
	
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

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

	public int getDepartamento_cod() {
		return departamento_cod;
	}

	public void setDepartamento_cod(int departamento_cod) {
		this.departamento_cod = departamento_cod;
	}
	
	
}
