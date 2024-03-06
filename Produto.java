package br.com.fiap.beans;

public class Produto {
	
	String produto;
	String valorProduto;
	String formaDePagamento;
	
	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setValoProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public String getValorProduto() {
		return valorProduto;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	
}
