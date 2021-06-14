
import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void selecaoModo() {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("1 - Fácil\n2 - Difícil");
            x = entrada.nextInt();

        } while (x < 0 && x > 2);

        switch (x) {
            case 1:
                modoFacil();
                break;
            case 2:
                modoDificil();
                break;
        }

    }

    static void modoFacil() {
        int x = 0, certas = 0; //j = 0
        int quantidadePerguntas = 10;
        Scanner entrada = new Scanner(System.in);
        String Perguntas[] = new String[quantidadePerguntas];
        String Alternativas[][] = new String[quantidadePerguntas][4];
        int Respostas[] = new int[quantidadePerguntas];
        System.out.println("---- Modo Fácil Selecionado ---- \n");
        Perguntas[0] = "A música 'Deixa a vida me levar' é um sucesso de qual famoso sambista brasileiro? ";
        Alternativas[0][0] = "DIOGO NOGUEIRA";
        Alternativas[0][1] = "ZECA PAGODINHO";
        Alternativas[0][2] = "MARTINHO DA VILA";
        Alternativas[0][3] = "ARLINDO CRUZ";
        Respostas[0] = 2;
        Perguntas[1] = "Qual dos pratos abaixo é típico na Itália? ";

        Alternativas[1][0] = "LASANHA";
        Alternativas[1][1] = "ESFIHA";
        Alternativas[1][2] = "TEMAKI";
        Alternativas[1][3] = "HAMBÚRGUE";
        Respostas[1] = 1;
        Perguntas[2] = "Como se chama o ramo da medicina que cuida dos idosos? ";
        Alternativas[2][0] = "PSIQUIATRIA";
        Alternativas[2][1] = "RADIOLOGIA";
        Alternativas[2][2] = "GERIATRIA";
        Alternativas[2][3] = "PEDAGOGIA";
        Respostas[2] = 3;
        Perguntas[3] = "Em qual continente fica a Guatemala?";
        Alternativas[3][0] = "ÁSIA";
        Alternativas[3][1] = "AMÉRICA";
        Alternativas[3][2] = "ÁFRICA";
        Alternativas[3][3] = "OCEANIA";
        Respostas[3] = 2;
        Perguntas[4] = "Instrumento óptico que consiste de dois óculos indênticos é o: ";
        Alternativas[4][0] = "TELESCÓPIO";
        Alternativas[4][1] = "BINÁRIO";
        Alternativas[4][2] = "BINÓCULOS";
        Alternativas[4][3] = "LUPA";
        Respostas[4] = 3;
        Perguntas[5] = "Qual dessas qualidades podemos atribuir a uma pessoa engenhosa?";
        Alternativas[5][0] = "INABILIDADE";
        Alternativas[5][1] = "INCAPACIDADE";
        Alternativas[5][2] = "INCOPETÊNCIA";
        Alternativas[5][3] = "HABILIDADE";
        Respostas[5] = 4;
        Perguntas[6] = "O neurônio fica em qual sistema?";
        Alternativas[6][0] = "CARDIOVASCULAR";
        Alternativas[6][1] = "EXCRETOR";
        Alternativas[6][2] = "NERVOSO";
        Alternativas[6][3] = "URINÁRIO";
        Respostas[6] = 3;
        Perguntas[7] = "Em que mês comemoramos os Dia dos Pais?";
        Alternativas[7][0] = "AGOSTO";
        Alternativas[7][1] = "DEZEMBRO";
        Alternativas[7][2] = "NOVEMBRO";
        Alternativas[7][3] = "SETEMBRO";
        Respostas[7] = 1;
        Perguntas[8] = "Quanto é o dobro de 750? ";
        Alternativas[8][0] = "1500";
        Alternativas[8][1] = "1600";
        Alternativas[8][2] = "1700";
        Alternativas[8][3] = "1800";
        Respostas[8] = 1;
        Perguntas[9] = "Quem foi o herói lendário que tirava sua força dos cabelos?";
        Alternativas[9][0] = "SANSÃO";
        Alternativas[9][1] = "HÉRCULES";
        Alternativas[9][2] = "JOÃO BATISTA";
        Alternativas[9][3] = "GOLIAS";
        Respostas[9] = 1;

        Random rd = new Random();

        int[] vetorRandomicoOpcoes = new int[4];
        //imprimeVetor(vetorRandomicoOpcoes);
        vetorRandomicoOpcoes = inicializaVetorRandomico(vetorRandomicoOpcoes);
        //imprimeVetor(vetorRandomicoOpcoes);
        vetorRandomicoOpcoes = embaralhaVetor(vetorRandomicoOpcoes);
        //imprimeVetor(vetorRandomicoOpcoes);
        int[] vetorRandomicoPergunta = inicializaVetorRandomico(Perguntas);// new int[10];
        //imprimeVetor(vetorRandomicoPergunta);
        vetorRandomicoPergunta = embaralhaVetor(vetorRandomicoPergunta);
        //System.out.println("");
        //imprimeVetor(vetorRandomicoPergunta);
        for (int i = 0; i < Perguntas.length; i++) {
            do {

                System.out.println((i + 1) + " - " + Perguntas[vetorRandomicoPergunta[i]] + "\n");
                for (int k = 0; k < vetorRandomicoOpcoes.length; k++) {
                    System.out.println((k + 1) + " - " + Alternativas[vetorRandomicoPergunta[i]][vetorRandomicoOpcoes[k]]);
                }
                //System.out.println(Alternativas[vetorRandomicoPergunta[i]] + "\n");
                System.out.println("\nOpção selecionada: ");
                x = entrada.nextInt();
                int posicaoRespostaCorreta = acharRespostaCorreta(vetorRandomicoOpcoes, Respostas[vetorRandomicoPergunta[i]]);
                if ((x) == posicaoRespostaCorreta) {
                    System.out.println("Parabéns! Você acertou. \n");
                    certas = certas + 1;
                } else {
                    System.out.println("Poxa! Você errou. \n");

                }
                //j++;
            } while (x < 0 && x > 4);

        }
        if (certas >= 6) {
            System.out.println("VOCÊ GANHOU O JOGO! \n");
        } else {
            System.out.println("VOCÊ PERDEU O JOGO! \n");
            System.out.println("Deseja tentar novamente? \n 1 - Sim\n 2 - Não ");
            x = entrada.nextInt();
            switch (x) {
                case 1:
                    modoFacil();
                    break;
                default:
            }
        }

    }

    static void modoDificil() {
        int x = 0, certas = 0; //j = 0
        int quantidadePerguntas = 10;
        Scanner entrada = new Scanner(System.in);
        String Perguntas[] = new String[quantidadePerguntas];
        String Alternativas[][] = new String[quantidadePerguntas][4];
        int Respostas[] = new int[quantidadePerguntas];
        System.out.println("---- Modo Difícil Selecionado ---- \n");
        Perguntas[0] = "Em economia, que nome se dá ao sócio de uma empresa que detém parte das ações? ";
        Alternativas[0][0] = "RESERVISTA";
        Alternativas[0][1] = "FUNCIONÁRIO";
        Alternativas[0][2] = "ACIONISTA";
        Alternativas[0][3] = "DIRETOR";
        Respostas[0] = 3;
        Perguntas[1] = "Uma tartaruga tem 4 patas, 6 tartarugas terão quantas patas? ";

        Alternativas[1][0] = "24";
        Alternativas[1][1] = "36";
        Alternativas[1][2] = "28";
        Alternativas[1][3] = "22";
        Respostas[1] = 1;
        Perguntas[2] = "O que é caxumba?";
        Alternativas[2][0] = "UMA COR";
        Alternativas[2][1] = "UMA SUBSTÂNCIA";
        Alternativas[2][2] = "UMA REGIÃO";
        Alternativas[2][3] = "UMA INFECÇÃO";
        Respostas[2] = 3;
        Perguntas[3] = "Em qual continente fica a Guatemala?";
        Alternativas[3][0] = "ÁSIA";
        Alternativas[3][1] = "AMÉRICA";
        Alternativas[3][2] = "ÁFRICA";
        Alternativas[3][3] = "OCEANIA";
        Respostas[3] = 2;
        Perguntas[4] = "Quais destes instrumentos não faz parte da cultura do índios? ";
        Alternativas[4][0] = "OCA";
        Alternativas[4][1] = "FLECHA";
        Alternativas[4][2] = "CANOAS";
        Alternativas[4][3] = "SNIPER";
        Respostas[4] = 3;
        Perguntas[5] = "Quem foi o primeiro astronauta brasileiro?";
        Alternativas[5][0] = "MARCOS CESAR PONTES";
        Alternativas[5][1] = "BUZZ ALDRIN";
        Alternativas[5][2] = "YURI GAGARIN";
        Alternativas[5][3] = "BUZZ LIGHTYEAR";
        Respostas[5] = 1;
        Perguntas[6] = "Qual dessas siglas é usada para designar um formato de arquivo de áudio na internet?";
        Alternativas[6][0] = "FLAC";
        Alternativas[6][1] = "GCG";
        Alternativas[6][2] = "CO2";
        Alternativas[6][3] = "SOS";
        Respostas[6] = 1;
        Perguntas[7] = "Como diz o ditado popular, ele está entregue ás?";
        Alternativas[7][0] = "ROSCAS";
        Alternativas[7][1] = "MOSCAS";
        Alternativas[7][2] = "TOSCAS";
        Alternativas[7][3] = "FOSCAS";
        Respostas[7] = 2;
        Perguntas[8] = "Membrana Plásmática, Citoplasma e Núcleo fazem partes das: ";
        Alternativas[8][0] = "CÉLULAS";
        Alternativas[8][1] = "BACTÉRIAS";
        Alternativas[8][2] = "FUNGOS";
        Alternativas[8][3] = "ÁTOMOS";
        Respostas[8] = 1;
        Perguntas[9] = "O que a Egiptologia estuda?";
        Alternativas[9][0] = "HISTÓRIO DA EUROPA";
        Alternativas[9][1] = "BRASIL";
        Alternativas[9][2] = "EGITO ANTIGO";
        Alternativas[9][3] = "ÉPOCA DAS CAVERNAS";
        Respostas[9] = 2;

        Random rd = new Random();

        int[] vetorRandomicoOpcoes = new int[4];
        //imprimeVetor(vetorRandomicoOpcoes);
        vetorRandomicoOpcoes = inicializaVetorRandomico(vetorRandomicoOpcoes);
        //imprimeVetor(vetorRandomicoOpcoes);
        vetorRandomicoOpcoes = embaralhaVetor(vetorRandomicoOpcoes);
        //imprimeVetor(vetorRandomicoOpcoes);
        int[] vetorRandomicoPergunta = inicializaVetorRandomico(Perguntas);// new int[10];
        //imprimeVetor(vetorRandomicoPergunta);
        vetorRandomicoPergunta = embaralhaVetor(vetorRandomicoPergunta);
        //System.out.println("");
        //imprimeVetor(vetorRandomicoPergunta);
        for (int i = 0; i < Perguntas.length; i++) {
            do {

                System.out.println((i + 1) + " - " + Perguntas[vetorRandomicoPergunta[i]] + "\n");
                for (int k = 0; k < vetorRandomicoOpcoes.length; k++) {
                    System.out.println((k + 1) + " - " + Alternativas[vetorRandomicoPergunta[i]][vetorRandomicoOpcoes[k]]);
                }
                //System.out.println(Alternativas[vetorRandomicoPergunta[i]] + "\n");
                System.out.println("\nOpção selecionada: ");
                x = entrada.nextInt();
                int posicaoRespostaCorreta = acharRespostaCorreta(vetorRandomicoOpcoes, Respostas[vetorRandomicoPergunta[i]]);
                if ((x) == posicaoRespostaCorreta) {
                    System.out.println("Parabéns! Você acertou. \n");
                    certas = certas + 1;
                } else {
                    System.out.println("Poxa! Você errou. \n");

                }
                //j++;
            } while (x < 0 && x > 4);

        }
        if (certas >= 8) {
            System.out.println("VOCÊ GANHOU O JOGO! \n");
        } else {
            System.out.println("VOCÊ PERDEU O JOGO! \n");
            System.out.println("Deseja tentar novamente? \n 1 - Sim\n 2 - Não ");
            x = entrada.nextInt();
            switch (x) {
                case 1:
                    modoFacil();
                    break;
                default:
            }
        }
    }

    static void instrucoes() {
        System.out.println("**************");
        System.out.println("INSTRUÇÕES: ");
        System.out.println("As perguntas têm apenas uma resposta correta. ");
        System.out.println("O jogador escolhe o nivel da pergunta entre Facil ou Dificil.");
        System.out.println("Se a resposta estiver correta o jogador obtem mais pontos. ");
        System.out.println("Não é possível eliminar opções de resposta");
        System.out.println("No final é sempre apresentada a resposta correta para o jogador");
        System.out.println("O jogo tem a opção de continuar no jogo ou sair quando quiser");
        System.out.println("**************\n");

    }

    static void creditos() {
        System.out.println("**************");
        System.out.println("Gabriel Pires, \nErika Sequalini, \nVinicius Prata, \nGiba Andarilho. ");
        System.out.println("**************");

    }

    static void sair() {
        System.out.println("Obrigado por jogar!");
        System.out.println("Tchau. ");

    }

    static void montarMenu() {

        System.out.println("**** { JOGO DE RPG } ****");
        System.out.println("___________________________");
        System.out.println("1 - Instruções");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
        System.out.println("___________________________");

    }

    static int lerMenu() {
        int x;

        System.out.println("Selecione a Opção Desejada: ");
        x = in.nextInt();

        switch (x) {
            case 1:
                instrucoes();
                break;
            case 2:
                selecaoModo();
                break;
            case 3:
                creditos();
                break;
            case 4:
                sair();
                break;
        }
        return x;
    }

    static void iniciarPrograma() {
        int retornoMenu;
        do {
            montarMenu();
            retornoMenu = lerMenu();
        } while (retornoMenu > 0 && retornoMenu < 4);

    }

    public static void main(String[] args) {
        iniciarPrograma();

    }

    private static void imprimeVetor(int[] vetorRandomicoPergunta) {

        for (int i = 0; i < vetorRandomicoPergunta.length; i++) {
            System.out.print(vetorRandomicoPergunta[i] + "\t");
        }
        System.out.println("");
    }

    private static int[] inicializaVetorRandomico(String[] vetorEntrada) {
        int[] vetorRetorno = new int[vetorEntrada.length];
        for (int i = 0; i < vetorEntrada.length; i++) {
            vetorRetorno[i] = i;
        }
        return vetorRetorno;
    }

    private static int[] inicializaVetorRandomico(int[] vetorEntrada) {
        int[] vetorRetorno = new int[vetorEntrada.length];
        for (int i = 0; i < vetorEntrada.length; i++) {
            vetorRetorno[i] = i;
        }
        return vetorRetorno;
    }

    private static int[] embaralhaVetor(int[] vetorRandomico) {

        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            int primeiroAleatorio = rd.nextInt(vetorRandomico.length);
            int segundoAleatorio = rd.nextInt(vetorRandomico.length);
            int temp = 0;
            temp = vetorRandomico[primeiroAleatorio];
            vetorRandomico[primeiroAleatorio] = vetorRandomico[segundoAleatorio];
            vetorRandomico[segundoAleatorio] = temp;
        }
        return vetorRandomico;
    }

    private static int acharRespostaCorreta(int[] vetorRandomicoOpcoes, int Resposta) {
        for (int k = 0; k < vetorRandomicoOpcoes.length; k++) {
            if ((Resposta - 1) == (vetorRandomicoOpcoes[k])) {
                return (k + 1);
            }
        }
        return 0;
    }

}
