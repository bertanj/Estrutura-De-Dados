package AtividadeFinal;

public class TestePilha {
    public static void main(String[] args) {
         PilhaSimples pilhaSimples = new PilhaSimples(4);
         Object[] elementos = {9,3,4,5};
         pilhaSimples.inserirSequencia(elementos);
         pilhaSimples.removerIndice(2);
         pilhaSimples.exibir();
         pilhaSimples.inserirElementoIndice(6,2);
        pilhaSimples.exibir();
    }

}
