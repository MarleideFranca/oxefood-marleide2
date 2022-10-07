package br.com.ifpe.oxefoodmarleide.modelo.produto;


import br.com.ifpe.oxefoodmarleide.util.entity.EntidadeAuditavel;



public class CategoriaProduto extends EntidadeAuditavel {

	private static final long serialVersionUID = 5118202318879054032L;
	
	private String chaveEmpresa;
	private String descricao;
	
	public String getChaveEmpresa() {
		return chaveEmpresa;
	}
	public void setChaveEmpresa(String chaveEmpresa) {
		this.chaveEmpresa = chaveEmpresa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}