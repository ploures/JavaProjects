
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		boolean acompanhado = true;
		//int quantidadePessoas = 2;
		//pode ser feito assim: boolean acompanhado = quantidadePessoas >= 2;
		//int n�o entra em boolean
		if (idade >= 18 || acompanhado) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
				System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}
