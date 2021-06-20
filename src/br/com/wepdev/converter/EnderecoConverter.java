package br.com.wepdev.converter;

import br.com.wepdev.model.Endereco;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/*
Classe que customizada de conversão de endereço
 */
@FacesConverter(forClass = Endereco.class) // Conversão para a classe endereço
public class EnderecoConverter implements Converter<Endereco> {


	/**
     * TRANSFORMA O VALOR DIGITADO NA TELA EM UM OBJETO DO TIPO ENDEREÇO
	 * @param context
     * @param ui
     * @param value VALOR DIGITADO NA TELA
	 * @return
     */
	@Override
	public Endereco getAsObject(FacesContext context, UIComponent ui, String value) {
		
		if (value == null) {
			return null;
		}
		String[] tokens = value.split(","); // A virgula e o delimitador
		Endereco endereco = new Endereco();
		endereco.setRua(tokens[0].trim()); // primeira posição é o que esta antes da virgula -- trim() RETIRA OS ESPAÇOS DO INICIO E DO FINAL DA STRING
		endereco.setNumero(tokens[1].trim()); // segunda posição e o número -- trim() RETIRA OS ESPAÇOS DO INICIO E DO FINAL DA STRING
		return endereco;
	}

	/**
     * PEGA O OBJETO ENDEREÇO E CONVERTE PARA STRING
	 * @param context
     * @param ui
     * @param endereco
     * @return
     */
	@Override
	public String getAsString(FacesContext context, UIComponent ui, Endereco endereco) {
		return endereco.getRua() + ", " + endereco.getNumero();
	}
}
