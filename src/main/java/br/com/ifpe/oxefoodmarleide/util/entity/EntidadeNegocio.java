package br.com.ifpe.oxefoodmarleide.util.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public abstract class EntidadeNegocio implements Serializable {

	private static final long serialVersionUID = -7435510029424995886L;
	private Long id;
	private Boolean habilitado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	
}