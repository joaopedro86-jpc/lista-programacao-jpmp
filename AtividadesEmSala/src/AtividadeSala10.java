import java.util.Scanner;

public class AtividadeSala10 {
    public static void main(String[] args) {
        int  contador = 0;
        Scanner leia = new Scanner(System.in);
        while (contador <= 10) {
            System.out.println("Digite um número inteiro de 0 a 10");
            int numero = leia.nextInt();

            System.out.println("A tabuáda de " + numero + " é:");
            while(contador <= 10){
                System.out.println(numero + "*" + contador + " = " + (numero * contador));
                contador++;
                
                


        }
    }
}}






