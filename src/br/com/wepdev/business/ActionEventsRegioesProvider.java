package br.com.wepdev.business;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


import br.com.wepdev.model.ActionEventsEstado;
import br.com.wepdev.model.ActionEventsRegiao;

// Todas as informacpes armazenadas em memoria
public class ActionEventsRegioesProvider {

	// Armazena as regioes em forma de String(id) e os estados respectivos a cada regiao
	private static final Map<String, ActionEventsRegiao> regioesMap = new TreeMap<>();

	static {
		ActionEventsRegiao regiao = null;
		ActionEventsEstado estado = null;
		
		regiao = new ActionEventsRegiao("Sul", "S");
		regioesMap.put("S", regiao);
		estado = new ActionEventsEstado("RS", "Rio Grande do Sul", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("SC", "Santa Catarina", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("PR", "Paraná", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new ActionEventsRegiao("Sudeste", "SE");
		regioesMap.put("SE", regiao);
		estado = new ActionEventsEstado("SP", "São Paulo", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("RJ", "Rio de Janeiro", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("ES", "Espírito Santo", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("MG", "Minas Gerais", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new ActionEventsRegiao("Nordeste", "NE");
		regioesMap.put("NE", regiao);
		estado = new ActionEventsEstado("BA", "Bahia", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("SE", "Sergipe", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("AL", "Alagoas", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("PE", "Pernambuco", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("PB", "Paraíba", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("RN", "Rio Grande do Norte", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("CE", "Ceará", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("PI", "Piauí", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("MA", "Maranhão", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new ActionEventsRegiao("Norte", "N");
		regioesMap.put("N", regiao);
		estado = new ActionEventsEstado("AM", "Amazonas", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("PA", "Pará", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("AC", "Acre", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("RO", "Rondônia", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("RR", "Roraima", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("TO", "Tocantins", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("AP", "Amapá", regiao);
		regiao.getEstados().add(estado);
		
		regiao = new ActionEventsRegiao("Centro-Oeste", "CO");
		estado = new ActionEventsEstado("MS", "Mato Grosso do Sul", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("MT", "Mato Grosso", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("GO", "Goiás", regiao);
		regiao.getEstados().add(estado);
		estado = new ActionEventsEstado("DF", "Distrito Federal", regiao);
		regiao.getEstados().add(estado);
		regioesMap.put("CO", regiao);
	}

	/**
	 * Metodo que retorna todas as regioes do Brasil
	 * @return
	 */
	public static Collection<ActionEventsRegiao> getRegioes() {
		return regioesMap.values();
	}

	/**
	 * Metodo que retorna todos os estados da regiao digitada
	 * @param siglaRegiao
	 * @return
	 */
	public static Collection<ActionEventsEstado> getEstadosByRegiao(String siglaRegiao) {
		ActionEventsRegiao regiao = regioesMap.get(siglaRegiao);
		if (regiao == null) {
			return Collections.emptyList();
		}
		return regiao.getEstados();
	}
}
