package br.com.ifpe.oxefoodmarleide.modelo.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodmarleide.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Marleide Alves
 *
 */
@Entity
@Table(name = "CategoriaProduto")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel {

	private static final long serialVersionUID = -326311128796609683L;

	public static final String LABEL = "Categoria de Produto";

	@JsonIgnore
	@NotNull
	@Column(nullable = false)
	private String chaveEmpresa;

	@NotNull
	@Column(nullable = false, length = 100)
	private String descricao;

	public void updateFrom(CategoriaProduto param) {
		this.setDescricao(param.getDescricao());
	}
}