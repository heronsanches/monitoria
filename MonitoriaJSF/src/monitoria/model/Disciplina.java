package monitoria.model;
/**
 * Database's relational model class
 */

public class Disciplina {
	
	/** varchar 10 pk*/
	private String cod; 
	
	/** varchar 200*/
	private String nome; 
	
	/** fk not null*/
	private int departamento_cod;
	
	
	//getters and setters
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDepartamento_cod() {
		return departamento_cod;
	}

	public void setDepartamento_cod(int departamento_cod) {
		this.departamento_cod = departamento_cod;
	}
	

}
