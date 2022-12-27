package br.com.ifpe.oxefoodmarleide.servicos.comprador;



import br.com.ifpe.oxefoodmarleide.modelo.comprador.Comprador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompradorRequest {

	private String nome;

	private String enderecoComercial;

	private String enderecoResidencial;

	private double comissao;

	private boolean trabalhoHomeOffice;

	private int qtdComprasMediasMes;
	
	private String regiaoAtuacao;

	public Comprador buildComprador() {

		return Comprador.builder()
				.nome(nome)
				.enderecoComercial(enderecoComercial)
				.enderecoResidencial(enderecoResidencial)
				.comissao(comissao)
				.trabalhoHomeOffice(trabalhoHomeOffice)
				.qtdComprasMediasMes(qtdComprasMediasMes)
				.regiaoAtuacao(regiaoAtuacao)
				.build();
	}

}
