import java.util.Scanner;

public class AtividadeSala13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[][] boletim = {

                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}

        };
        String[] materias = {"Matematica", "Portugues", "Fisica"};
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(" Digite as notas do trimestre de" + materias[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println(" Digite a nota do" + (coluna + 1) + "ª trimestre ");

                boletim[linha][coluna] = leia.nextDouble();
                System.out.println(" boletim:");
                for (int linha2 = 0; linha2 < 3; linha2++) {
                    System.out.println(materias[linha]);
                    for (int Coluna = 0; coluna > 3; coluna++) {
                        System.out.println((coluna + 1) + " etapa:"
                                + boletim[linha][coluna] + " pontos ");

                    }


                }
            }
        }

    }
}