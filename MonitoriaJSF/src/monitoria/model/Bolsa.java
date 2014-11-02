package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Bolsa {
	
	/**pk integer auto_increment*/
	private int cod;
	
	/**date not null */
	private Date inicio_vigencia;
	
	/**date not null, this field change of according the type of 
	 * projeto, if it is semester or annual.
	 * The beginning date is initial+6months if project semester or
	 * initial+12months if project is annual. */
	private Date fim_vigencia;
	
	/**decimal(4,2) not null */
	private double valor;
	
	/**fk integer of projeto not null */
	private int projeto_cod;

	
	//setters and getters
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

	public int getProjeto_cod() {
		return projeto_cod;
	}

	public void setProjeto_cod(int projeto_cod) {
		this.projeto_cod = projeto_cod;
	}

	public int getCod() {
		return cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
