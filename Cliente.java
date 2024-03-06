package br.com.fiap.beans;

public class Cliente {
	
	// Metodos e Atributos
	String nome;
	int idade;
	String cep;
	String endereco;
	
	// Setters (entrada)
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	
	// Getters (retorno/exibir)
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getEndereco() {
		return endereco;
	}

}
