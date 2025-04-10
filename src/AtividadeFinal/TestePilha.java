package AtividadeFinal;

public class TestePilha {
    public static void main(String[] args) {
         PilhaSimples pilhaSimples = new PilhaSimples(4);
        pilhaSimples.inserirElemento(3);
        pilhaSimples.inserirElemento(1);
        pilhaSimples.inserirElemento(8);
        pilhaSimples.inserirElemento(5);

        pilhaSimples.ordenarCrescente();
        pilhaSimples.exibir();
    }

}
