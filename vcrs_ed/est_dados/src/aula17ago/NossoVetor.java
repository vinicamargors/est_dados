package aula17ago;

import java.util.Random;

public class NossoVetor {
    //atributo encapsulado, vetor de inteiros
    static int count = 0;
    private int [] dados;
    //construtores com sobrecarga
    
    //sobrecarga de métodos/construtor: consiste em variar o conjunto de parâmetros em quantidade ou tipo
    public NossoVetor (int capacidade){
        dados = new int[capacidade];
        count++;
    }
    public NossoVetor (){
        this(10);
    }

    public int[] getDados() {
        return dados;
    }
    public void setPosicao(int pos, int valor){
        dados[pos] = valor;
    }
    public void somaUmVetor(NossoVetor aux){
        for (int i=0; i<this.dados.length; i++){
            this.dados[i] =+ aux.dados[i];
        }
    }
    public static NossoVetor somaDoisVetores (NossoVetor vA, NossoVetor vB){
        NossoVetor vResult = new NossoVetor(vA.dados.length);
        for (int i=0; i<vA.dados.length; i++){
            vResult.dados[i] = vA.dados[i] + vB.dados[i];
        }
        return vResult;
    }

    public void preencheVetor(){
        Random rand = new Random();
        for (int i = 0; i<this.dados.length; i++){
            dados[i] = rand.nextInt(dados.length*10);
        }
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i<this.dados.length; i++){
            s+= dados[i] + " ";
        }
        return s;
    }
}
