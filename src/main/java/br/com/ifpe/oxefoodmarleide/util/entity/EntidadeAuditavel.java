package br.com.ifpe.oxefoodmarleide.util.entity;




import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


public abstract class EntidadeAuditavel extends EntidadeNegocio {

	private static final long serialVersionUID = 2733316564324261868L;
	private long versao;
	private LocalDate dataCriacao;
	private LocalDate dataUltimaModificacao;
	private Long criadoPor;
	private Long ultimaModificacaoPor;
	public long getVersao() {
		return versao;
	}
	public void setVersao(long versao) {
		this.versao = versao;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDate getDataUltimaModificacao() {
		return dataUltimaModificacao;
	}
	public void setDataUltimaModificacao(LocalDate dataUltimaModificacao) {
		this.dataUltimaModificacao = dataUltimaModificacao;
	}
	public Long getCriadoPor() {
		return criadoPor;
	}
	public void setCriadoPor(Long criadoPor) {
		this.criadoPor = criadoPor;
	}
	public Long getUltimaModificacaoPor() {
		return ultimaModificacaoPor;
	}
	public void setUltimaModificacaoPor(Long ultimaModificacaoPor) {
		this.ultimaModificacaoPor = ultimaModificacaoPor;
	}

}