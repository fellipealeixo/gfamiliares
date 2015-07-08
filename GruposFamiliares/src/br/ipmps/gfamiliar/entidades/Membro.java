package br.ipmps.gfamiliar.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Membro extends Individuo {
	private static final long serialVersionUID = 4610118536838155541L;
	
	private GrupoFamiliar grupo;

	public Membro() {
		super();
	}   

	@ManyToOne
	public GrupoFamiliar getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoFamiliar grupo) {
		this.grupo = grupo;
	}
}
