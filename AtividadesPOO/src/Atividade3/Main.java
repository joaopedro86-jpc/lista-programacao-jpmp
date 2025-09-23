package Atividade3;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto("Marca", "Modelo", 0, "Desc", 0);
        carro.falar();
        System.out.println("-----------------------");
        moto.falar();
    }
}