import java.util.Scanner;

public class Atividade52 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius* 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = leia.nextDouble();

        System.out.println("Temperatura em Fahrenheit: " + celsiusParaFahrenheit(celsius));
    }
}