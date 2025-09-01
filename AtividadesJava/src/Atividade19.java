import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("maior de idade");


        }else {
            System.out.println("menor de idade");
        }
    }
}
