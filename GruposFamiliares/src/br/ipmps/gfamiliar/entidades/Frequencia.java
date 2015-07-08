package br.ipmps.gfamiliar.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Frequencia implements Serializable {
	private static final long serialVersionUID = -603415482497198334L;

	private int id;
	private Membro membro;
	private boolean presenca;
	private boolean justificativa;
	
	public Frequencia() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	public boolean isJustificativa() {
		return justificativa;
	}

	public void setJustificativa(boolean justificativa) {
		this.justificativa = justificativa;
	}
}
