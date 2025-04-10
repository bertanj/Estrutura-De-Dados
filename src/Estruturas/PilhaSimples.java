package Estruturas;

public class PilhaSimples {
    private int tamanho;
    private String[] pilha;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new String[tamanho];
    }

    public void inicializa(int tamanho) {
        PilhaSimples pilhaSimples = new PilhaSimples(tamanho);
    }

    public void empilhar(String conteudo){
        if (cheia()) {
            System.out.println("Não há espaço na pilha...");
        }else {
            for (int i = 0; i < tamanho; i++) {
                if(checarConteudoIndice(i)) {
                    pilha[i] = conteudo;
                    return;
                }
            }
        }
    }

    public void desempilhar(){
        if (vazia()) {
            System.out.println("Pilha não contem nenhum conteudo para desempilhar...");
        }else if (cheia()){
            this.pilha[tamanho - 1] = null;
        }else{
            for (int i = 0; i < tamanho; i++) {
                if(pilha[i] == null) {
                    pilha[i-1] = null;
                }
            }
        }
    }

    public void visualizar(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pilha[i]);
        }
    }

    public boolean vazia() {
        if (this.pilha[0] == null) {
            return true;
        }
        return false;
    }

    public boolean cheia() {
        for (int i = 0; i < tamanho; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean checarConteudoIndice(int indice) {
        if(this.pilha[indice] == null) {
            return true;
        }
        return false;
    }
}
