package Atividade1;

public class Lampada {
    private boolean ligada;
    private int brilho;
    private String cor;

    public Lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";
    }

    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("A lâmpada foi ligada");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("A lâmpada foi desligada");
    }

        public void aumentarBrilho ( int aumentar){
            this.brilho += aumentar;
            if (this.brilho > 100) {
                this.brilho = 100;
            }
            System.out.println("Brilho aumentado para " + this.brilho);
        }

        public void reduzirBrilho ( int valor) {
            this.brilho -= valor;
        }
            public void abaixarBrilho(int abaixar) {
                this.brilho -= abaixar;
                if (this.brilho < 0) {
                    this.brilho = 0;
                }
                System.out.println("Brilho reduzido para " + this.brilho);
                System.out.println("Brilho diminuido para " + this.brilho);
            }

            public void mudarCor(String novaCor){
                this.cor = novaCor;
                System.out.println("A cor da lâmpada foi alterada para " + this.cor);
            }
        }

