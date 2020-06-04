
public class Pedido {
	private float valor_total;
	private ItemPedido item;
	
	public boolean adicionar_item(ItemPedido item) {
		
		
		this.setItem(item);
		return true;
		
	
	}

	public double obter_total() {
		return item.getTotal_valor();
	}
	
	public float getValor_total() {
		return valor_total;
	}


	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public ItemPedido getItem() {
		return item;
	}

	public void setItem(ItemPedido item) {
		this.item = item;
	}

}
