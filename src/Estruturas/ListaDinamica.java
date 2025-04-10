package Estruturas;

public class ListaDinamica {
    private int contador = 0;
    private No primeiro;

    public ListaDinamica(String conteudo) {
        this.primeiro = new No(conteudo);
    }

    public void verLista() {
        if(!estaVazio()) {
            No aux = primeiro;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public boolean estaVazio() {
        if(primeiro == null) { //A lista está vazia
            System.out.println("Adicionando primeiro elemento da lista...");
            return true;
        } else {
            return false;
        }
    }

    public void inserirValor(String conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazio()) {
            this.primeiro = novoNo;
        }else {
            No aux = this.primeiro;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            incrementarContador();
            aux.setProx(novoNo);
        }
    }

    public void removerValor(String conteudo) {
        No aux = this.primeiro;
        if (this.primeiro.getConteudo().equals(conteudo)) {//Removendo primeiro elemento
            this.primeiro = this.primeiro.getProx();
        } else {
            decrementarContador();
            try {
                while (aux != null) {
                    if (aux.getProx().getConteudo().equals(conteudo)) {
                        aux.setProx(aux.getProx().getProx());
                        return;
                    }
                    aux = aux.getProx();
                }
            }catch (Exception e) {//Caso dê o erro no bloco try{} de '... value of "Estruturas.No.getProx()" is null'  será lançado uma mensagem para o usuario saber que digitou o conteudo errado.
                System.out.println("Não foi possível remover o elemento (" + conteudo+ ") da lista, pois não existe!");
            }
        }
    }

    public int verQuantidadeValores() {
        if(primeiro != null) {
            this.setContador(this.getContador()+1);
        }
        return this.getContador();
    }

    public void incrementarContador(){
        this.setContador(this.getContador()+1);
    }

    public void decrementarContador(){
        this.setContador(this.getContador()-1);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}