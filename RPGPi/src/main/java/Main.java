
import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void mostrarVetor() {
        String Perguntas[] = new String[20];
        Perguntas[0] = "1 - A música 'Deixa a vida me levar' é um sucesso de qual famoso sambista brasileiro? ";
        Perguntas[1] = "2 - Qual dos pratos abaixo é típico na Itália? ";
        Perguntas[2] = "3 - Como se chama o ramo da medicina que cuida dos idosos? ";
        Perguntas[3] = "4 - Em qual continente fica a Guatemala? ";
        Perguntas[4] = "5 - Instrumento óptico que consiste de dois óculos indênticos é o: ";
        Perguntas[5] = "6 - Qual dessas qualidades podemos atribuir a uma pessoa engenhosa?";
        Perguntas[6] = "7 - O neurônio fica em qual sistema?";
        Perguntas[7] = "8 - Em que mês comemoramos os Dia dos Pais?";
        Perguntas[8] = "9 - Quanto é o dobro de 750? ";
        Perguntas[9] = "10 - Quem foi o herói lendário que tirava sua força dos cabelos?";
        Perguntas[10] = "11 - Em economia, que nome se dá ao sócio de uma emresa que detém parte das ações?";
        Perguntas[11] = "12 - Uma tartaruga tem 4 patas, 6 tartarugas terão quantas patas?";
        Perguntas[12] = "13 - O que é caxumba?";
        Perguntas[13] = "14 - Quem foi o primeiro astronauta brasileiro?";
        Perguntas[14] = "15 - Qual dessas siglas é usada para designar um formato de arquivo de áudio na internet?";
        Perguntas[15] = "16 - Como diz o ditado popular, ele está entregue ás?";
        Perguntas[16] = "17  - Membrana Plásmática, Citoplasma e Núcleo fazem partes das:";
        Perguntas[17] = "18 - O que a Egiptologia estuda?";
        Perguntas[18] = "19 - Quais destes instrumentos não faz parte da cultura do índios? ";
        Perguntas[19] = "20 - A minhoca é popularmente usada na: ";

        for (int i = 0; i < Perguntas.length; i++) {
            System.out.println(Perguntas[i]);

        }

    }

    static int[] embaralharVetores(int n[], int x) {
        Random gerador = new Random();
        for (int i = 0; i < x; i++) {
            int random = gerador.nextInt(n.length);
            int random2 = gerador.nextInt(n.length);
            int placeholder = n[random];
            n[random] = n[random2];
            n[random2] = placeholder;
        }

        return n;
    }

    static void instrucoes() {
        System.out.println("**************");
        System.out.println("Instruções: ");
        System.out.println("...Ainda estão sendo montadas...");
        System.out.println("**************");

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
                System.out.println("Jogar");
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
        mostrarVetor();

    }

}
