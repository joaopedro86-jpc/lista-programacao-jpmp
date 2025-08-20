import java.util.Scanner;

public class AtividadeSala02 {
    public static void main(String[] args) {
        String nome = "João Pedro";
        String sobrenome = "Moreira";
        int idade = 17;
        double peso = 61.2;
        double altura = 1.75;
        double imc = 0;
        System.out.println(nome + " " + sobrenome);
        System.out.println("Idade:" + idade);
        System.out.println("Peso:" + peso + "; Altura:" + altura);
        int anoNascimento = 2025 - idade;
        System.out.println("Ano:" + anoNascimento);
        imc = peso/(altura*altura);
        System.out.println("IMC:" + imc);

    }
}