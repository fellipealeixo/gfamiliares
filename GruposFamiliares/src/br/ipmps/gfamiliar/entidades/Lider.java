package br.ipmps.gfamiliar.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Lider extends Individuo {
	private static final long serialVersionUID = 1397640548581757832L;
	
	private GrupoFamiliar grupoLiderado;

	public Lider() {
		super();
	}

	@OneToOne(mappedBy="lider")
	public GrupoFamiliar getGrupoLiderado() {
		return grupoLiderado;
	}

	public void setGrupoLiderado(GrupoFamiliar grupo) {
		this.grupoLiderado = grupo;
	}
}
