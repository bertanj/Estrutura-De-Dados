package Estruturas;

public class PilhaDinamica {
    private No primeiro;
    private No ultimo;

    public PilhaDinamica(String conteudo) {
        this.primeiro = new No (conteudo);
        this.ultimo = this.primeiro;
    }

    public void empilhar(String conteudo) {
        No novoNo = new No(conteudo);
        if(vazia()){
            this.primeiro = novoNo;
            this.ultimo = primeiro;
        }else{
            this.ultimo.setProx(novoNo);
            this.ultimo = novoNo;
        }
    }

    public void desempilhar() {
        if(vazia()){
            System.out.println("Pilha vazia, sem conteudos para desempilhar...");
        }else {
            No aux = this.primeiro;
            if(this.primeiro == this.ultimo) {
                this.primeiro = null;
                this.ultimo = null;
            }else {
                while (aux != null) {
                    if (aux.getProx().getConteudo().equals(this.ultimo.getConteudo())) {
                        this.ultimo = aux;
                        aux.setProx(aux.getProx().getProx());
                        return;
                    }
                    aux = aux.getProx();
                }
            }
        }
    }

    public boolean vazia() {
        if(this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void visualizar() {
        if(vazia()) {
            System.out.println("Não existem elementos na fila.");
        } else {
            No aux = this.primeiro;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }
}
