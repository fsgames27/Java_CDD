package javapo;

public class Testedepessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome="Ana Clara";
		p1.idade = 20;
		
		p2.nome="Jão";
		p2.idade = 25;
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		
		p1.comer("Pipoca");
	}

}
