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
                    break;
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
                            break;

                        case 3:
                            System.out.println("Informe quantos elementos deseja remover:");
                            int tamanhoOp3 = scanner.nextInt();
                            if (tamanhoOp3 > tamanho){
                                System.out.println("Quantidade de elementos ultrapassa tamanho da pilha");
                                return;
                            }
                            Object[] elementosOp3 = new Object[tamanhoOp3];
                            for (int i = 0; i < tamanhoOp3; i++) {
                                System.out.println("Insira o "+(i+1)+" elemento:");
                                elementosOp3[i] = scanner.next();
                            }
                            pilhaSimples.removerSequencia(elementosOp3);
                            break;

                        case 4:
                            System.out.println("Informe a ocorrencia que deseja remover:");
                            Object elementoOp4 = scanner.next();
                            pilhaSimples.removerTodasOcorrencias(elementoOp4);
                            break;
                    }
                    break;
                case 3:
                    pilhaSimples.exibir();
                    break;

                case 4:
                    System.out.println("1-Buscar elemento");
                    System.out.println("2-Buscar elemento por indice");
                    int indiceOp4 = scanner.nextInt();
                    switch (indiceOp4){
                        case 1:
                            System.out.println("Informe o elemento que deseja buscar:");
                            Object elementoOp3 = scanner.next();
                            if (pilhaSimples.buscarElemento(elementoOp3)){
                                System.out.println("Elemento existe na pilha!");
                            }else{
                                System.out.println("Elemento não encontrado...");
                            }
                            break;

                        case 2:
                            System.out.println("Digite o indice que deseja buscar:");
                            int indiceOp2 = scanner.nextInt();
                            System.out.println(pilhaSimples.buscarElementoIndice(indiceOp2));
                            break;
                    }
                    break;

                case 5:
                    System.out.println("1-Ordenar crescente");
                    System.out.println("2-Ordenar decrescente");
                    System.out.println("3-Quantidade elementos");
                    System.out.println("4-Dobrar capacidade");
                    System.out.println("5-Editar elemento");
                    System.out.println("6-Limpar pilha");
                    System.out.println("7-Obter primeiro elemento");
                    System.out.println("8-Obter ultimo elemento");
                    int opcaoOp5 = scanner.nextInt();
                    switch (opcaoOp5){
                        case 1:
                            pilhaSimples.ordenarCrescente();
                            break;

                        case 2:
                            pilhaSimples.ordenarDecrescente();
                            break;

                        case 3:
                            System.out.println(pilhaSimples.quantidadeElementos());
                            break;

                        case 4:
                            pilhaSimples.dobrarCapacidade();
                            System.out.println("Capacidade dobrada!");
                            break;

                        case 5:
                            System.out.println("Digite o elemento que deseja substituir:");
                            Object elementoAntigoOp5 = scanner.next();
                            System.out.println("Digite o elemento que irá ser adicionado no lugar do elemento substituido");
                            Object elementoNovoOp5 = scanner.next();
                            pilhaSimples.editarElemento(elementoAntigoOp5, elementoNovoOp5);
                            System.out.println("Elemento editado!");
                            break;

                        case 6:
                            pilhaSimples.limpar();
                            System.out.println("Pilha limpa!");
                            break;

                        case 7:
                            System.out.println(pilhaSimples.obterPrimeiroElemento());
                            break;

                        case 8:
                            System.out.println(pilhaSimples.obterUltimoElemento());
                            break;
                    }
                break;
            }
        }while (opcao!= 0);

    }
}
