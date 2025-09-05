import java.util.Scanner;

public class Atividade53{
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = leia.nextInt();

        System.out.println(n + (ehPrimo(n) ? " é primo" : " não é primo"));
    }
}
