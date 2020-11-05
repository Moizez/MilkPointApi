package com.milkpointapi.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Retirada implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;

	@Column
	private float quantidade;

	@Column
	private double valor = 0;

	@ManyToOne
	@JoinColumn(name = "retirada_laticinio")
	private Laticinio laticinio;

	@ManyToOne
	@JoinColumn(name = "retirada_tanque")
	private Tanque tanque;

	@Column
	private boolean confirmacao = false;

	@Column
	private boolean excluido = false;

	@Column
	private String efetuou;

	@Column
	private String observacao;

	@Column
	private ZonedDateTime dataNow;

	@Column
	private ZonedDateTime dataSolicitacao;

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Laticinio getLaticinio() {
		return laticinio;
	}

	public void setLaticinio(Laticinio laticinio) {
		this.laticinio = laticinio;
	}

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}

	public boolean getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(boolean confirmacao) {
		this.confirmacao = confirmacao;
	}

	public boolean getExcluido() {
		return excluido;
	}

	public void setExcluido(boolean excluido) {
		this.excluido = excluido;
	}

	public String getEfetuou() {
		return efetuou;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setEfetuou(String efetuou) {
		this.efetuou = efetuou;
	}

	public ZonedDateTime getDataNow() {
		return dataNow;
	}

	public void setDataNow(ZonedDateTime dataNow) {
		this.dataNow = dataNow;
	}

	public ZonedDateTime getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(ZonedDateTime dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
