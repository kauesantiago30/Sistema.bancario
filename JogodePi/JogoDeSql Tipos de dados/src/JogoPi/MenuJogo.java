package JogoPi;
import java.util.Scanner;

public class MenuJogo {

    Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;


        System.out.println("██████╗    █████╗ ████████╗ █████╗ ██████╗ ██╗ █████╗ ");
        System.out.println("██╔══██╗  ██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║██╔══██╗");
        System.out.println("██║  ██║  ███████║   ██║   ███████║██████╔╝██║███████║");
        System.out.println("██║  ██║  ██╔══██║   ██║   ██╔══██║██╔══██╗██║██╔══██║");
        System.out.println("██████╔╝  ██║  ██║   ██║   ██║  ██║██║  ██║██║██║  ██║");
        System.out.println("╚═════╝   ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝");




        do {
            System.out.println("\n===== MENU DO JOGO =====");
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    Jogo jogo = new Jogo(); // Cria o objeto da classe Jogo
                    jogo.jogar();           // Chama o método jogar da outra classe
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }

    public void instrucoes() {
        System.out.println("\n--- INSTRUÇÕES ---");
        System.out.println("Use as opções do menu para jogar e se divertir!");
    }

    public void creditos() {
        System.out.println("\n--- CRÉDITOS ---");
        System.out.println("Jogo desenvolvido por: ");
        System.out.println(" Eduardo 👾");
        System.out.println(" Isaque 👾");
        System.out.println(" Guilherme 👾");
    }

    public void sair() {
        System.out.println("\nSaindo do jogo... Até mais!");
    }

    public static void main(String[] args) {
        MenuJogo menu = new MenuJogo();
        menu.exibirMenu(); // Inicia o menu
    }
}

