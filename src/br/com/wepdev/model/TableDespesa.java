package br.com.wepdev.model;

import java.util.Date;

public class TableDespesa {

	private Date data;
	private String descricao;
	private Double valor;
	private boolean edit; // Indica se a despesa esta em modo de edição ou não

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}
}
