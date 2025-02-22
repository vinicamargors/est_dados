public class NossoVetor {
    private int ocupacao;
    private int[] vetor;
    public NossoVetor(int tamanho){
        vetor = new int[tamanho];
        ocupacao = 0;

    }

public NossoVetor(){
    this(10);
}

public boolean inserir(int elemento){
    if(!estaCheio()){
        vetor[ocupacao++] = elemento;
        return true;
    }
    return false;
}

public boolean estaCheio(){
    return ocupacao == vetor.length;
}

@Override

}
