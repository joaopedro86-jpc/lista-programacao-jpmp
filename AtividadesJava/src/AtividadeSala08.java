import java.util.Scanner;

public class AtividadeSala08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = "";
        int idade = 0;
        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();
        System.out.println("Digite o seu idade: ");
        idade = leia.nextInt();
        System.out.println("seu nome é " + nome);
        System.out.println("Voce tem " + idade + "de idade.");


    }
}
