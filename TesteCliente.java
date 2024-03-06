package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto
		Cliente objCliente = new Cliente ();
		Produto objProduto = new Produto ();
		
		// Cliente - Entrada
		objCliente.setNome("Kayky Marques Martins");
		objCliente.setIdade(20);
		objCliente.setCep("06112-010");
		objCliente.setEndereco("Av. Horacio Lafer, 86");
		
		// Produto - Entrada
		objProduto.setProduto("Livro: Bom dia Veronica");
		objProduto.setValoProduto("R$ 44,00");
		objProduto.setFormaDePagamento("Pix");
		
		// Cliente - Saida
		System.out.println(objCliente.getNome());
		System.out.println(objCliente.getIdade());
		System.out.println(objCliente.getCep());
		System.out.println(objCliente.getEndereco());
		
		//Produto - Saida
		System.out.println(objProduto.getProduto());
		System.out.println(objProduto.getValorProduto());
		System.out.println(objProduto.getFormaDePagamento());
	
		}
	
	}
