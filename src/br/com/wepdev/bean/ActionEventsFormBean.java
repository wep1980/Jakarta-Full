package br.com.wepdev.bean;

import br.com.wepdev.business.ActionEventsRegioesProvider;
import br.com.wepdev.model.ActionEventsEstado;
import br.com.wepdev.model.ActionEventsRegiao;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;



@Named("formActionEvents")
@SessionScoped // Escopo de sessao, a sessao funciona enquanto a pagina estiver aberta
public class ActionEventsFormBean implements Serializable {
	
	private Collection<ActionEventsRegiao> regioes;
	private Collection<ActionEventsEstado> estados;
	private String siglaRegiao;
	private String siglaEstado;

	/**
	 * Metodo e chamado assim que o bean for construido
	 */
	@PostConstruct
	public void init() {
		regioes = ActionEventsRegioesProvider.getRegioes(); // Metodo que retorna uma colecao de regioes
	}

	/**
	 * Metodo que carrega os estados na tela apos uma regiao ser escolhida
	 * @param event
	 */
	public void carregarEstados(ActionEvent event) {
		this.estados = ActionEventsRegioesProvider.getEstadosByRegiao(siglaRegiao);
	}

	
	public Collection<ActionEventsRegiao> getRegioes() {
		return regioes;
	}
	
	public Collection<ActionEventsEstado> getEstados() {
		return estados;
	}
	
	public String getSiglaRegiao() {
		return siglaRegiao;
	}

	public void setSiglaRegiao(String siglaRegiao) {
		this.siglaRegiao = siglaRegiao;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
}
