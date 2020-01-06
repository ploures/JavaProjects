
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		// boolean acompanhado = quantidadePessoas >= 2;
		if (quantidadePessoas >= 2) {
			acompanhado = true; // variável boolean = acompanhado nasce quando abre chaves e morre quando fecha
		} else {
			acompanhado = false;
		}
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
