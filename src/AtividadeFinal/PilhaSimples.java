package AtividadeFinal;

public class PilhaSimples implements IEstruturaSimples{
    private int tamanho;
    private Object[] pilha;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new Object[tamanho];
    }

    @Override
    public void inserirElemento(Object elemento) {
        if(estaCheia()){
            System.out.println("Não há espaço na pilha...");
        }else if (estaVazia()){
            pilha[0] = elemento;
        }else{
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] == null){
                    pilha[i] = elemento;
                    return;
                }
            }
        }
    } //OK

    @Override
    public void inserirElementoIndice(Object elemento, int indice) {
        if (indice > pilha.length || indice < 1){
            System.out.println("Indice inválido! Insira um valor entre 1 e " + pilha.length);
        }else if (pilha[indice-1] != null){
            System.out.println("Posição já está ocupada. impossível inserir elemento...");
        }else {
            pilha[indice] = elemento;
        }
    }

    @Override
    public void inserirSequencia(Object[] elementos) {
        if (estaVazia()) {
            for (int i = 0; i < elementos.length && i < pilha.length; i++) {
                pilha[i] = elementos[i];
            }
        } else if (estaCheia()) {
            System.out.println("Pilha não contém espaço para Inserir valores");
        } else {
            int aux = 0;
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] == null && aux < elementos.length) {
                    pilha[i] = elementos[aux];
                    aux++; //Passa para o próximo elemetno
                }
            }
        }
    }

    @Override
    public boolean removerElemento() {
        if (estaVazia()){
            System.out.println("Pilha não contém elemento para ser removido...");
        }else if (estaCheia()){
            pilha[pilha.length-1] = null;
            return true;
        }else{
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] == null){
                    pilha[i-1] = null;
                }
            }
            return true;
        }
        return false;
    }//OK

    public Object removerIndice(int indice){
        if (indice > pilha.length || indice < 1){
            System.out.println("Indice inválido! Insira um valor entre 1 e " + pilha.length);
        }else if (pilha[indice -1] == null){
            System.out.println("Conteudo nulo no indice passado. Impossível remover...");
        }else{
            pilha[indice - 1] = null;
        }
        return pilha[indice];
    }//OK

    @Override
    public void removerSequencia(Object[] elementos) {

    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
        int contador = 0;
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == elemento){
                pilha[i] = null;
                contador++;
            }
        }
        System.out.println("Total de "+ contador + " ocorrências removidas!");
    }//Ok

    @Override
    public boolean estaCheia() {
        if(this.pilha[pilha.length-1] != null) {
            return true;
        }
        return false;
    } //OK

    @Override
    public boolean estaVazia() {
        if(this.pilha[0] == null) {
            return true;
        }
        return false;
    } //OK

    @Override
    public boolean buscarElemento(Object elemento) {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == elemento){
                return true;
            }
        }
        return false;
    }//OK

    @Override
    public Object buscarElementoIndice(int indice) {
        if (indice > pilha.length || indice < 1){
            System.out.println("Indice inválido! Insira um valor entre 1 e " + pilha.length);
            return null;
        }
        return pilha[indice-1];
    }//OK

    @Override
    public void ordenarCrescente() {
        if (pilha[0] instanceof Integer) {
            for (int i = 0; i < pilha.length; i++) {
                for (int j = 0; j < pilha.length; j++) {
                    if((Integer) pilha[i] < (Integer) pilha[j]){
                        Object aux = pilha[i];
                        pilha[i] = pilha[j];
                        pilha[j] = aux;
                    }
                }
            }
        }
    }

    @Override
    public void ordenarDecrescente() {
        if (pilha[0] instanceof Integer) {
            for (int i = 0; i < pilha.length; i++) {
                for (int j = 0; j < pilha.length; j++) {
                    if((Integer) pilha[i] > (Integer) pilha[j]){
                        Object aux = pilha[i];
                        pilha[i] = pilha[j];
                        pilha[j] = aux;
                    }
                }
            }
        }
    }

    @Override
    public int quantidadeElementos() {
        int contador = 0;
        for (int i = 0; i < pilha.length; i++) {
            if(pilha[i] != null){
                contador++;
            }
        }
        return contador;
    }//OK

    @Override
    public void dobrarCapacidade() {
        Object[] pilhaAumentada = new Object[pilha.length*2];
        for (int i = 0; i < pilha.length; i++) {
            pilhaAumentada[i] = pilha[i];
        }
        pilha = pilhaAumentada;
    }//OK

    @Override
    public void editarElemento(Object elementoAntigo, Object elementoNovo) {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == elementoAntigo){
                pilha[i] = elementoNovo;
                return;
            }
        }
    }//OK

    @Override
    public void limpar() {
        for (int i = 0; i < pilha.length; i++) {
            while(pilha[i] != null)
                pilha[i] = null;
        }
    }//OK

    @Override
    public void exibir() {
        for (int i = 0; i < pilha.length; i++) {
            System.out.println(pilha[i]);   
        }
    } //OK

    @Override
    public Object obterPrimeiroElemento() {
        if (estaVazia()){
            System.out.println("Não existe elementos na pilha...");
            return null;
        }
            return pilha[0];
    } //OK

    @Override
    public Object obterUltimoElemento() {
        for (int i = 0; i < pilha.length; i++) {
            if (estaCheia()){
                return pilha[pilha.length-1];
            }else if (pilha[i] != null && pilha[i+1] == null){
                return pilha[i];
            }
        }
        return null;
    }//OK
}