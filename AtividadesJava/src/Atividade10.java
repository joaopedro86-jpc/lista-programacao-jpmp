import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        int valor = 0, contador = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber sua tabuada");
        valor = leia.nextInt();

        while (contador<=10){
            System.out.println(valor + "*" + contador + " = " + (valor*contador));
            contador++;
        }
    }

}