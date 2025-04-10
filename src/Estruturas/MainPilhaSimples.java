package Estruturas;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(4);
        pilhaSimples.empilhar("Mateus");
        pilhaSimples.empilhar("Ana");
        pilhaSimples.empilhar("Maria Paula");
        pilhaSimples.empilhar("Ricardo");
        pilhaSimples.visualizar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.visualizar();
    }
}
