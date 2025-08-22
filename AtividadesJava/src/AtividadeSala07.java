import java.util.Scanner;

public class AtividadeSala07 {
    public static void main(String[] args) {
        int a = 5, b = 5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0)
        {
            System.out.println("Todos os valores são negativos");
        }else if(a < 0 || b < 0 || x < 0 || y < 0){
            System.out.println("Pelos menos um valor e negativo.");

        }else {
            System.out.println("Todos os valores são positivos");
        }
        char oppcao = 'S';
        switch (oppcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
                case 'N':
                    System.out.println("A opção  'N' foi escolhida ");
                    break;}
                        System.out.println("A opção 'S' foi escolhida ");

                        Scanner leia = new Scanner(System.in);
                        System.out.println(" Digite sua idade: ");
                                int idade = leia.nextInt();
                        if(idade >=18) System.out.println(" Voce é de maior");
            System.out.println("Digite seu sexo: (m, f)");
            char opcao = leia.next().toLowerCase().charAt(0);
            switch (opcao){
            case 'm':
                System.out.println("Masculino");
                break;
                case 'f':
                    System.out.println("Feminino");
                    break;
                default:
                    System.out.println("Pessoa invalida");
        }
    }
}
