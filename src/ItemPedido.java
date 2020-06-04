
public class ItemPedido {
	private int quantidade;
	private double  total_valor;
	private Produto produto;
	
	public ItemPedido(Produto produto, int quantidade, float total_valor) {
		this.quantidade = quantidade;
		this.total_valor = total_valor;
		this.setProduto(produto); 	
	}
	

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal_valor() {
		return total_valor;
	}

	public void setTotal_valor(double total_valor) {
		this.total_valor = total_valor;
		
		total_valor = produto.getValor() * quantidade;

	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}

