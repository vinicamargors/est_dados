public class NossoVetor {
    private int ultPos;
    private int[] dados;
    public NossoVetor (int capacidade){
        ultPos = -1;
        dados = new int[capacidade];
    }
    //métodos de acesso
    public int getUltPos(){
        return ultPos;
    }
    public int[] getDados(){
        return dados;
    }
    //métodos modificadores
    public void setUltPos(int pos){
        if (pos>=0 && pos < dados.length){
            ultPos = pos;
        }
        else{
            ultPos = dados.length-1;
        }
    }
    @Override
    public String toString(){
      String s = "";
      if(estaVazio()){
        s = s + "Vetor vazio";
      }
      else{
        for (int i = 0; i <= ultPos;i++){
            s = s + dados[i] + " ";
        }
      }
      return s + "\n";
    }
    public boolean estaCheio(){
        return ultPos == dados.length-1;
        // faz a mesma coisa do trecho acima!
        // if (ultPos == dados.length-1){
        //     return true;
        // }
        // return false;
    }
    public boolean estaVazio(){
        return ultPos == -1;
    }
    public void adiciona(int e) {
      if (estaCheio()){
        int[] temp = new int[dados.length*2];
        for(int i = 0; i <= ultPos; i++){
          temp[i] = dados[i];
        }
      }
      dados[++ultPos] = e;
 
  }
 
  public int remove(){
    if (estaVazio()){
      return -1;
    }
    int aux = dados[ultPos--];
    return aux;
  }
}

// para inserir valore randômicos no vetor
public void preecherVetor () {
    for (int i=0; i<dados.lenght; i++) {
        dados[i] = Math.random
    }
}