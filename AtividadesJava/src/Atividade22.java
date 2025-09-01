import java.util.Scanner;
public class Atividade22 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y =0;
        if (x > 0) {
            System.out.println("positivo");

        }else if(x < 0){
            System.out.println("negativo");
        } else {
            System.out.println("zero");

        }
    }
}
