package exemplo1;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leia  = new Scanner(System.in);


        Pessoa pessoa = new Pessoa ();

        pessoa.nome = "joão";
        pessoa.idade = 16;


        System.out.println("nome " + pessoa.nome);
        System.out.println("Idade"+ pessoa.idade);
    }
}