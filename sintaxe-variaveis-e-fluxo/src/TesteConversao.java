
public class TesteConversao {

	public static void main (String[] args) {
		double salario = 1270.5;
		
		float pontoFlutuante = 3.14f; //mostrando que é float com o f no final
		
		int valor = (int) salario; //sem casting não funciona (int)
		System.out.println(valor);
		//int pode guardar até 2 bilhões
		
		long numeroGrande = 12345678910L; //L = long para informar que sabe que estourou o limite
		short valorPequeno = 2131;
		byte b = 127;
	
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);		
		
	}
}
