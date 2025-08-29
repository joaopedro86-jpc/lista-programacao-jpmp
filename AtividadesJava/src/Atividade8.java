import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0, media;
        System.out.println("Digite a primeiro notas: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segundo notas: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceiro notas: ");
        n3 = leia.nextDouble();
        media = (n1+n2+n3)/3;
        System.out.println("A media das notas é: " + media);



    }
}
