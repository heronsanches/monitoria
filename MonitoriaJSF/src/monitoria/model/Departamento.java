package monitoria.model;
/**
 * Database's relational model class
 */

public class Departamento {

	/** pk auto_increment*/
	private int cod;
	
	/** varchar(150)*/
	private String nome;

	
	public int getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
