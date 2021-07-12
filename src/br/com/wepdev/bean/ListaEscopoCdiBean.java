package br.com.wepdev.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.*;
import javax.inject.Inject;
import javax.inject.Named;


@Named
//@RequestScoped // escopo com o tempo de vida muito curto, onde nao e guaradado o resultado de iterações anteriores
//@ApplicationScoped // escopo que dura enquanto a aplicacao estiver ativa, bean compartilhado por todos
//@SessionScoped // escopo que fica ativo para uma sessão de usuario especifico, geralmente dura enquanto a janela do usuario esta aberta,
// dentro da sessao pode conter o de conversation
@ConversationScoped // O programador define onde começa e onde termina o escopo
public class ListaEscopoCdiBean implements Serializable {

	private String item;
	private List<String> itens = new ArrayList<>();
	
	@Inject
	private Conversation conversation; // Objeto que gerencia o ciclo de vida do escopo


	public String adicionarServeTodosEscopos() {
		itens.add(item);
		item = null;
		return null;
	}

	public String removerTudoServeTodosEscopos() {
		if (itens.size() > 0) {
			itens.clear();
		}
		return null;
	}

	
	public String adicionar() {
		if (itens.size() == 0) {
			conversation.begin(); // Inicio do escopo
		}
		itens.add(item);
		item = null;
		return null;
	}

	public String removerTudo() {
		if (itens.size() > 0) {
			itens.clear();
			conversation.end(); // Finaliza o escopo
		}
		
		return null;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public List<String> getItens() {
		return itens;
	}
}
