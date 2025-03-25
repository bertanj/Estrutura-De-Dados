public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica("Mateus");
        pilhaDinamica.empilhar("Maria Paula");
        pilhaDinamica.empilhar("Jose");
        pilhaDinamica.visualizar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.visualizar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.visualizar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.visualizar();
    }
}
