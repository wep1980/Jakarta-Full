package br.com.wepdev.bean;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("formvalidadorcustomizado")
@RequestScoped
public class FormBeanValidadorCustomizado implements Serializable {

	private Date dataNasc;

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}
