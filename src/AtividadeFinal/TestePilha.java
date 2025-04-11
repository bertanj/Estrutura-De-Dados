package AtividadeFinal;

public class TestePilha {
    public static void main(String[] args) {
         PilhaSimples pilhaSimples = new PilhaSimples(4);
         Object[] elementos = {2,3,4,5};
         pilhaSimples.inserirElemento(1);
        pilhaSimples.inserirElemento(1);
        pilhaSimples.inserirElemento(1);
         pilhaSimples.inserirSequencia(elementos);
         pilhaSimples.exibir();
    }

}
