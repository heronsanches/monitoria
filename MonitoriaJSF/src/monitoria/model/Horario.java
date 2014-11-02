package monitoria.model;

import java.util.Date;

/**
 * Database's relational model class
 */

public class Horario {
	
	/** pk auto_increment*/
	private int cod;
	
	/** not null*/
	private Date hora_inicio;
	/** not null*/
	private Date hora_fim;

	private String seg;
	private String ter;
	private String qua;
	private String qui;
	private String sex;
	private String sab;
	
	
	//setters and getters
	public int getCod() {
		return cod;
	}
	public Date getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Date getHora_fim() {
		return hora_fim;
	}
	public void setHora_fim(Date hora_fim) {
		this.hora_fim = hora_fim;
	}
	public String isSeg() {
		return seg;
	}
	public void setSeg(String seg) {
		this.seg = seg;
	}
	public String isTer() {
		return ter;
	}
	public void setTer(String ter) {
		this.ter = ter;
	}
	public String isQua() {
		return qua;
	}
	public void setQua(String qua) {
		this.qua = qua;
	}
	public String isQui() {
		return qui;
	}
	public void setQui(String qui) {
		this.qui = qui;
	}
	public String isSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String isSab() {
		return sab;
	}
	public void setSab(String sab) {
		this.sab = sab;
	}
	
	
	
}
