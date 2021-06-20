package br.com.wepdev.bean;

import br.com.wepdev.model.Endereco;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named("formconvercust")
@RequestScoped
public class FormBeanConversorCustomizado implements Serializable {

	private Endereco endereco;

	/*
	Contrutor com a função de trasnformar o endereço de objeto para string.
	Quando a tela for carregada o endereço ja tem q vim preenchido
	 */
	/*public FormBeanConversorCustomizado() {
		endereco = new Endereco();
		endereco.setRua("Rua conversão de objeto para string");
		endereco.setNumero("777");
	}*/
	
	public String processar() {
		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Número: " + endereco.getNumero());
		return "result";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
