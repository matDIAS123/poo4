import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

			Produto p[] = new Produto[10];
			
			p[0] = new Produto(123, 5.25, "Geladeira");
			
			p[1] = new Produto(123, 5.25, "Geladeira");

			p[2] = new Produto(123, 5.25, "Geladeira");

			p[3] = new Produto(123, 5.25, "Geladeira");
			
			p[4] = new Produto(123, 5.25, "Geladeira");
			
			p[5] = new Produto(123, 5.25, "Geladeira");
			
			p[6] = new Produto(123, 5.25, "Geladeira");
			
			p[7] = new Produto(123, 5.25, "Geladeira");
			
			p[8] = new Produto(123, 5.25, "Geladeira");
			
			p[9] = new Produto(123, 5.25, "Geladeira");
			
		
			Pedido pe1 = new Pedido();
			ItemPedido it = new ItemPedido(null, 0, 0);

			
			Scanner sc = new Scanner(System.in);

			
			
			System.out.println("Menu de opções:");
			System.out.println("1 - Adicionar pedido");
			System.out.println("2- Apresentar o total do pedido.");
			System.out.println("Escolha");
			int op = sc.nextInt();
			
			switch(op){
				 
				case 1: 
					System.out.println("Digite a quantidade do produto: ");
						it.setQuantidade(Integer.parseInt(sc.nextLine()));
					
						break;
						
				case 2: 
					
					pe1.obter_total();
					
					break;
			
		}
			sc.close();


	}

}
