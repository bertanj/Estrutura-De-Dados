package AtividadeFinal;

public class TestePilha {
    public static void main(String[] args) {
         PilhaSimples pilhaSimples = new PilhaSimples(4);
         Object[] elementos = {1,3,5,0};
         pilhaSimples.inserirSequencia(elementos);
        pilhaSimples.ordenarCrescente();
        pilhaSimples.exibir();

    }

}
