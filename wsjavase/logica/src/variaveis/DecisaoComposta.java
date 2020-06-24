import java.util.Scanner;
class DecisaoComposta{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = teclado.next();
		System.out.println("Digite a nota 1:");
		float nota1 = teclado.nextFloat();
		System.out.println("Digite a nota 2:");
		float nota2 = teclado.nextFloat();
		float media = (nota1+nota2)/2;
		if(media >= 6){
			System.out.println("Parabens " + nome + " voce esta aprovado!");
		}
		else if(media < 4){
			System.out.println("Infelizmente " + nome + " voce esta reprovado!");
		}
		else{
			System.out.println("ATENÇÃO " + nome + " voce esta de EXAME!");
		}
	}
}