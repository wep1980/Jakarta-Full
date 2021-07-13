package br.com.wepdev.model;

public class ActionEventsEstado implements Comparable<ActionEventsEstado> {

	private String sigla;
	private String nome;
	private ActionEventsRegiao regiao; // Um estado pertence a uma regiao....e uam regiao pode ter varios estados

	/**
	 * Contrutor
	 * @param sigla
	 * @param nome
	 * @param regiao
	 */
	public ActionEventsEstado(String sigla, String nome, ActionEventsRegiao regiao) {
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
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

	public ActionEventsRegiao getRegiao() {
		return regiao;
	}

	public void setRegiao(ActionEventsRegiao regiao) {
		this.regiao = regiao;
	}

	@Override
	public int compareTo(ActionEventsEstado o) {
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
		ActionEventsEstado other = (ActionEventsEstado) obj;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

}
