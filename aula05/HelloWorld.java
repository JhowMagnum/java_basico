import java.util.Scanner;
class HelloWorld{
	
	public static void main(String[] args){

		String nome;
		Scanner dados = new Scanner(System.in);

		System.out.println("Hello, World Dev!");

		System.out.println("What's name? ");

		nome = dados.nextLine();
		
		System.out.println("Welcome to "+ nome);
	}

}