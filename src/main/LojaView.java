package main;
import dominio.ProdutoDuravel;
import dominio.ProdutoNaoDuravel;
import dominio.Deposito;
import java.util.ArrayList;
import java.util.Scanner;

import dominio.Deposito;

public class LojaView {
	public static void main(String[] args) {

		Deposito deposito = new Deposito();
		
		ProdutoDuravel pd1 = new ProdutoDuravel("carro", 70000, "chevrolet", "chevrolet onix", "09/2021", 30);
		ProdutoDuravel pd2 = new ProdutoDuravel("livro", 40, "livraria x", "livro amarelo", "08/2022", 7);
		ProdutoDuravel pd3 = new ProdutoDuravel("celular", 1300, "samsung", "galaxy ..", "01/2022", 4);
		
		ProdutoNaoDuravel pdn1 = new ProdutoNaoDuravel("chocolate", 8, "diamante negro", "chocolate", "01/2022", "01/2023", "alimentos");
		ProdutoNaoDuravel pdn2 = new ProdutoNaoDuravel("toalha", 30, "toalhas x", "toalha branca", "01/2022", "01/2024", "higiene");
		ProdutoNaoDuravel pdn3 = new ProdutoNaoDuravel("sabonete", 2, "protex", "sabonete branco", "01/2022", "09/2022", "higiene");
		
		deposito.adicionar_produto(pd1);
		deposito.adicionar_produto(pd2);
		deposito.adicionar_produto(pd3);
		
		deposito.adicionar_produto(pdn1);
		deposito.adicionar_produto(pdn2);
		deposito.adicionar_produto(pdn3);
		
		deposito.remover_produto(pdn2);
		
		System.out.println("Maior preco:");
		System.out.println(deposito.retorna_maior_preco().toString());
		
		System.out.println(deposito.statusEstoque());
		
	}
}
