package br.ipmps.gfamiliar.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Pastor extends Individuo {
	private static final long serialVersionUID = -3770384971843320748L;

	private List<GrupoFamiliar> gruposSuportados;
	
	public Pastor() {
		super();
	}

	@OneToMany
	public List<GrupoFamiliar> getGruposSuportados() {
		return gruposSuportados;
	}

	public void setGruposSuportados(List<GrupoFamiliar> gruposSuportados) {
		this.gruposSuportados = gruposSuportados;
	}
}
