package br.ipmps.gfamiliar.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Supervisor extends Individuo {
	private static final long serialVersionUID = 3765098663523829940L;
	
	private List<GrupoFamiliar> gruposSupervisionados;

	public Supervisor() {
		super();
	}

	@OneToMany(mappedBy="supervisor")
	public List<GrupoFamiliar> getGruposSupervisionados() {
		return gruposSupervisionados;
	}

	public void setGruposSupervisionados(List<GrupoFamiliar> gruposSupervisionados) {
		this.gruposSupervisionados = gruposSupervisionados;
	}
}
