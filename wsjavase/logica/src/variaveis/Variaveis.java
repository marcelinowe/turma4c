import java.util.Scanner;
class Variaveis{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
        String nome = teclado.next() + teclado.nextLine();
	System.out.println("Digite seu sobrenome: ");
        String sobreNome = teclado.next() + teclado.nextLine();
        System.out.print("Nome Completo: " + nome);
        System.out.println(" " + sobreNome);
	System.out.println("Digite sua Idade: ");
        int idade = teclado.nextInt();
        System.out.println("Idade: " + idade);
	System.out.println("Digite sua Altura: ");
        float altura = teclado.nextFloat();
	System.out.println("Digite seu Peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Altura: " + altura);
	System.out.println("Peso: " + peso);
	float imc = peso / (altura*altura);
	System.out.println("IMC: " + imc);
    }
}