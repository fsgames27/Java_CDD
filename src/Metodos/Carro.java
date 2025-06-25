package Metodos;

public class Carro {
	public String cor;
	public double preco;
	public String modelo;
	
	/* CONSTRUTOR PADRÃO*/
	
	public Carro() {
		
	}
	 /* CONSTRUTOR COM 2 PARÂMETROS */
	 public Carro(String modelo, double preco){
	 //Se for escolhido o construtor sem a COR do veículo
	
	 // definimos a cor padrão como sendo PRETA
	 this.cor = "PRETA";
	 this.modelo = modelo;
	 this.preco = preco;
	 }
	 /* CONSTRUTOR COM 3 PARÂMETROS */
	 public Carro(String cor, String modelo,double preco){
	 this.cor = cor;
	 this.modelo = modelo;
	 this.preco = preco;
	 }
	 


}
