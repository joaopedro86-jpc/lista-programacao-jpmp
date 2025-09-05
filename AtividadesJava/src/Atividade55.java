import java.util.Scanner;

public class Atividade55 {
    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++) fat *= i;
        return fat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        System.out.println("Fatorial: " + fatorial(n));
    }
}
