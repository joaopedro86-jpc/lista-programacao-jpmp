import java.util.Scanner;

public class AtividadeSala09 {

    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro de 0 a 10 : ");

        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();
        do {
            numero++;
            System.out.println("vezes que o do/while rodou: " + numero);

        } while (numero < 10);
        boolean sair = false;
        do{
            System.out.println("Ecolha uma das opções abaixo");
            System.out.println("1- cadastraer novo usuario"
                               "2- Editar usuario \n +
                               "3- Excluir usuario \n +
                    "0 sair \n"
            );
            int opcao = leia.nextInt();
            switch(opcao){
            case 0:}
            sair  = true;
        }

    }
}
