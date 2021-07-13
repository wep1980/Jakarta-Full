package br.com.wepdev.model;

import java.util.Set;
import java.util.TreeSet;

public class ActionEventsRegiao implements Comparable<ActionEventsRegiao> {

	private String sigla;
	private String nome;
	private Set<ActionEventsEstado> estados = new TreeSet<>(); // Conjunto de estados

	public ActionEventsRegiao(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<ActionEventsEstado> getEstados() {
		return estados;
	}

	public void setEstados(Set<ActionEventsEstado> estados) {
		this.estados = estados;
	}

	@Override
	public int compareTo(ActionEventsRegiao o) {
		return this.nome.compareTo(o.nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActionEventsRegiao other = (ActionEventsRegiao) obj;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}
}
