
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

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

    }
}
