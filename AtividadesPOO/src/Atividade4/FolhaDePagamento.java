package Atividade4;

public class FolhaDePagamento {
    public void pagar(Funcionario f){
        System.out.println("Pagamento\n" +
                "Funcionario: " + f .getNome() +
                "Valor recebido: " + f.calcularPagamento());
    }



}
