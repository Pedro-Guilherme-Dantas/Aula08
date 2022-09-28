package dominio;
import dominio.ProdutoDuravel;
import dominio.ProdutoNaoDuravel;
import dominio.Produto;
import java.util.ArrayList;
import java.util.Iterator;


public class Deposito {
	ArrayList<Produto> produtos = new ArrayList();
	Produto produto_maior_preco;
	public void adicionar_produto(Produto produto) {
		produtos.add(produto);
	}
	
	public void remover_produto(Produto p) {
		for (int i = 0; i < produtos.size(); i++) {
			if (p == produtos.get(i)) {
				try {
				produtos.remove(i);
				System.out.println("Produto removido com sucesso!");
				} catch (Exception e) {
					System.out.println("Erro ao remover produto!");
				}
				break;
			}
		}
	}
	
	public Produto retorna_maior_preco () {
		double maior_preco = 0;
		for (int i = 0; i < produtos.size(); i++) {
			double preco = produtos.get(i).getPreco();
			if (preco > maior_preco) {
				produto_maior_preco = produtos.get(i);
				maior_preco = preco;
			}
		}
		return produto_maior_preco;
	}
	
	public String statusEstoque() {
		if (produtos.size() == 0) {
			return "Estoque vazio";
		}
		else {
			return "Quantidade de produtos em estoque: "+produtos.size();
		}
	}
	
	
}
