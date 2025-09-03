import java.util.Scanner;
public class Atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        if (p > q){
            System.out.println("Ps maior");

        }
        if (p < q){
            System.out.println("P menor");

        }
        if (p == q){
            System.out.println("P maior ou menor ");

        }

    }
}
