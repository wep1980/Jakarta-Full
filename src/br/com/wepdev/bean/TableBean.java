package br.com.wepdev.bean;

import br.com.wepdev.model.TableDespesa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;



@Named("table")
@SessionScoped // O escopo de sessão permite que o bean fique vivo durante as diversas requisições, pois os dados vão ser armazenados em memoria
public class TableBean implements Serializable {

	private List<TableDespesa> despesasList = new ArrayList<>();
	private ListDataModel<TableDespesa> despesas = new ListDataModel<>(despesasList); // O table model fornece informações que a lista nao fornece


	// Construtor com 2 despesas criadas
	/*public TableBean() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Despesa d = new Despesa();

		try {
			d.setData(sdf.parse("15/02/2030"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		d.setEdit(false); // Nao esta editavel
		d.setValor(135.0);
	    despesasList.add(d); // Adicionando a despesa criada na lista

		d = new Despesa();

		try {
			d.setData(sdf.parse("20/03/2030"));
		} catch (ParseException e) {
		}

		d.setDescricao("Item Qualquer 2");
		d.setEdit(false); // Nao esta editavel
		d.setValor(1000.0);
		despesasList.add(d); // Adicionando a despesa criada na lista
	} */
	
	public String inserir() { // Cadastra uma nova despesa
		TableDespesa d = new TableDespesa();
		d.setEdit(true);
		despesasList.add(d);
		return null; // Retorna para a propria tela
	}

	/**
	 * Metodo que edita uma despesa
	 * @param despesa
	 * @return
	 */
	public String editar(TableDespesa despesa) {
		despesa.setEdit(true); // Na hora e editar habilita o modo de edicao
		return null; // retorna para a mesma tela
	}

	/**
	 * Metodo que grava uma despesa
	 * @param despesa
	 * @return
	 */
	public String gravar(TableDespesa despesa) {
		despesa.setEdit(false); // Na hora de gravar desabilita o modo de edicao
		return null;
	}
	
	public String excluir(TableDespesa despesa) {
		despesasList.remove(despesa);
		return null;
	}
	
	public ListDataModel<TableDespesa> getDespesas() {
		return despesas;
	}
}
