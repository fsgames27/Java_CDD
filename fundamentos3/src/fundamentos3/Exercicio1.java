package fundamentos3;

public class Exercicio1 {
	public static void main(String[] args) {
		String texto = new String();
		String str = "hello mundo";
		texto = str.replace("hello", "olá");
		System.out.println(texto);
		texto = str.substring(3);
		System.out.println(texto);
		texto = str.substring(3,8);
		System.out.println(texto);
}
}
