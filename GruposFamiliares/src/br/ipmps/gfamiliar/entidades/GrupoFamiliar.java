package br.ipmps.gfamiliar.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class GrupoFamiliar implements Serializable {
	private static final long serialVersionUID = 781636085681356724L;

	private int id;
	private String nome;
	private String mensagem;
	private String diaReuniao;
	private String horaReuniao;
	private String localReuniao;
	private Supervisor supervisor;
	private Lider lider;
	private List<Membro> membros;
	private List<Reuniao> reunioes;

	public GrupoFamiliar() {
		super();
	}  
	
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDiaReuniao() {
		return this.diaReuniao;
	}

	public void setDiaReuniao(String diaReuniao) {
		this.diaReuniao = diaReuniao;
	}   
	
	public String getHoraReuniao() {
		return this.horaReuniao;
	}

	public void setHoraReuniao(String horaReuniao) {
		this.horaReuniao = horaReuniao;
	}
	
	public String getLocalReuniao() {
		return this.localReuniao;
	}

	public void setLocalReuniao(String localReuniao) {
		this.localReuniao = localReuniao;
	}

	@ManyToOne
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	@OneToOne
	public Lider getLider() {
		return this.lider;
	}

	public void setLider(Lider lider) {
		this.lider = lider;
	}

	@OneToMany(mappedBy="grupo")
	public List<Membro> getMembros() {
		return membros;
	}

	public void setMembros(List<Membro> membros) {
		this.membros = membros;
	}

	@OneToMany(mappedBy="grupo")
	public List<Reuniao> getReunioes() {
		return reunioes;
	}

	public void setReunioes(List<Reuniao> reunioes) {
		this.reunioes = reunioes;
	}
}
