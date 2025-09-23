package Atividade4;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome,double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }
        public void setComissao ( double valor){
            this.comissao = valor;
        }

        public double getComissao () {
            return this.comissao;
        }
            public double calcularPagamento () {
                return this.getSalarioBase() + this.comissao;

            }
        }




