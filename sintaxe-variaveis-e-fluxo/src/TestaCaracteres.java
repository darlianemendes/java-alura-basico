
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor); //isso acontece por causa da tabela unicode 66 corresponde a letra B.
		
		valor = (char) (valor + 1); //casting
		System.out.println(valor);
		
		String palavra = "Estou aprendendo Java em ";
		palavra = palavra + 2021;
		System.out.println(palavra); //concatenando texto com número.
	}
}
