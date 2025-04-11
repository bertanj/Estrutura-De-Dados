package AtividadeFinal;

import java.util.Scanner;

public class MenuPilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da sua pilha:");
        int tamanho = scanner.nextInt();
        int opcao;

        PilhaSimples pilhaSimples = new PilhaSimples(tamanho);

        do {
            System.out.println("Selecione uma das categorias:");
            System.out.println("1-Inserir");
            System.out.println("2-Remover");
            System.out.println("3-Exibir");
            System.out.println("4-Buscar");
            System.out.println("5-Outros");
            System.out.println("0-Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1-Inserir elemento");
                    System.out.println("2-Inserir elemento por indice");
                    System.out.println("3-Inserir sequencia");
                    int opcaoInserirOp1 = scanner.nextInt();
                    switch (opcaoInserirOp1){
                        case 1:
                            System.out.println("Informe o elemento que deseja inserir na pilha:");
                            Object elementoOp1 = scanner.next();
                            pilhaSimples.inserirElemento(elementoOp1);
                            break;

                        case 2:
                            System.out.println("Informe o elemento que deseja inserir:");
                            Object elementoOp2 = scanner.next();
                            System.out.println("Informe o indice no qual deseja inserir:");
                            int indiceOp2 = scanner.nextInt();
                            pilhaSimples.inserirElementoIndice(elementoOp2, indiceOp2);
                            break;

                        case 3:
                            System.out.println("Informe quantos elementos deseja inserir:");
                            int tamanhoOp3 = scanner.nextInt();
                            if (tamanhoOp3> tamanho){
                                System.out.println("Pilha não comporta a quantidade informada...");
                                return;
                            }
                            Object[] elementosOp3 = new Object[tamanhoOp3];
                            for (int i = 0; i < tamanhoOp3; i++) {
                                System.out.println("Insira o "+(i+1)+" elemento:");
                                elementosOp3[i] = scanner.next();
                            }
                            pilhaSimples.inserirSequencia(elementosOp3);
                            break;
                    }
                case 2:
                    System.out.println("1-Remover elemento");
                    System.out.println("2-Remover elemento por indice");
                    System.out.println("3-Remover sequencia");
                    System.out.println("4-Remover todas ocorrencias");
                    int opcaoInserirOp2 = scanner.nextInt();
                    switch (opcaoInserirOp2){
                        case 1:
                            pilhaSimples.removerElemento();
                            System.out.println("Elemento removido...");
                            break;

                        case 2:
                            System.out.println("Essa operação fere a regra da pilha. Certeza que deseja continuar?(sim/nao)");
                            String verify = scanner.next();
                            if (verify.equalsIgnoreCase("sim")){
                                System.out.println("Indique o indice que deseja remover o valor:");
                                int indiceOp2 = scanner.nextInt();
                                pilhaSimples.removerIndice(indiceOp2);
                            }else{
                                System.out.println("saindo do programa...");
                            }
                    }
            }
        }while (opcao!= 0);

    }
}
