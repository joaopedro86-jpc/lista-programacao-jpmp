package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria cb = new ContaBancaria("Cauã", "77777777", 99999999);
        ContaBancaria cb2 = new ContaBancaria("Cruz", "88888888", 00000000);

        System.out.println("Digite o valor a ser depositado: ");
        cb.setDepositar(cb.getSaldo(), scanner.nextDouble());
        System.out.println("Foi depositado: "+cb.getDeposito());
        System.out.println("Digite o valor a ser sacado: ");
        cb.setSacar(cb.getSaldo(), scanner.nextDouble());
        System.out.println("Foi sacado: "+cb.getSaque()+", o valor restante na conta é: "+"noFunction");
        System.out.println("Digite o valor a ser trasnferido para: "+ cb2.getNome());
        cb.setTransferencia(cb.getSaldo(), scanner.nextDouble());
        cb2.setPostrasnferencia(cb2.getSaldo(), cb.getTransferencia());
        System.out.println("o Saldo de: " + cb.getNome() + " é de " + "noFunction" + "\n" +
                " O valor transferido para: " + cb2.getNome() + " é de: " + cb.getTransferencia());


    }
}