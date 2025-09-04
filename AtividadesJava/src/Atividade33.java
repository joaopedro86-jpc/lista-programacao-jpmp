
import java.util.Scanner;
public class Atividade33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0, contador = -2, soma =0;
        double media;
        do {
            System.out.println("Digite um idade: ");
            idade = leia.nextInt();
            contador++;
            soma =+ idade;
        }  while (idade > -1);
        media = soma/contador;
        System.out.println("a media das idades é : " + media);


    }

}
