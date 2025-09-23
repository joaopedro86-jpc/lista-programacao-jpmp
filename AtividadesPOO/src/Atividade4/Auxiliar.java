package Atividade4;

public class Auxiliar extends Funcionario{
    private boolean cor0000 = false;
    public Auxiliar(String nome, double salarioBase, boolean
                    cor0000){
        super(nome, salarioBase);
        this.cor0000 = cor0000;


    }

    public double calcularSalario(){
        return super.getSalarioBase() + (cor0000 ? (super.getSalarioBase() -600):0);
    }
}
