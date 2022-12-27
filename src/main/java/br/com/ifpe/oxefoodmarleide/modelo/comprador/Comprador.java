package br.com.ifpe.oxefoodmarleide.modelo.comprador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodmarleide.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comprador")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comprador extends EntidadeAuditavel{

	private static final long serialVersionUID = -2212448270757863984L;

	

	@Column
	private String nome;

	@NotNull
	@Column
	private String enderecoComercial;

	@Column
	private String enderecoResidencial;

	@Column
	private double comissao;

	@Column
	private boolean trabalhoHomeOffice;

	@Column
	private int qtdComprasMediasMes;
	
	@Column
	private String regiaoAtuacao;

	public void updateFrom(Comprador param) {
		this.setNome(param.getNome());
		this.setEnderecoComercial(param.getEnderecoComercial());
		this.setEnderecoResidencial(param.getEnderecoResidencial());
		this.setComissao(param.getComissao());
		this.setTrabalhoHomeOffice(param.isTrabalhoHomeOffice());
		this.setQtdComprasMediasMes(param.getQtdComprasMediasMes());
		this.setRegiaoAtuacao(param.getRegiaoAtuacao());
	}

}
