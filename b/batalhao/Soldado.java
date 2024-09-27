package batalhao;

public class Soldado {
    private String nome;
    private int posicao;
    private String arma;

    //pensar sobre o contrrole de instâncias

    public Soldado(String nome){
        this.nome = nome;
        this.posicao = 0;
        this.arma = "762";
    }

    public void movimentar(int distancia){
        System.out.println(nome + "Se moveu" + distancia + "metros");
        movimentar(10); // distancia padrão
    }

    //pensar na sobrecarga
    public void atacar(){
        System.out.println(nome + "atacou com " + arma);
    }

    //gets e sets

    public int getposicao(){
        return posicao;
    }

    public String getnome(){
        return nome;
    }

    public void setarma(String novaArma){
        this.nome = novaArma;
    }
}