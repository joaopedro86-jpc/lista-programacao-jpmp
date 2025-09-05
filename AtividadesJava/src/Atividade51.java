import java.util.Scanner;
public class Atividade51 {
    public static int soma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int x = leia.nextInt();
        System.out.print("Digite o segundo numero: ");
        int y = leia.nextInt();

        System.out.println("Soma: " + soma(x, y));
    }
}