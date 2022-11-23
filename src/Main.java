import java.util.Scanner;

public class Main {

    public static Jokenpo startGame() {
        System.out.println("******* Jo-ken-po *******\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String playerName = scan.next().toUpperCase();

        Player user = new Player(playerName);

        Player IA = new Player("IA");

        System.out.print(playerName + ", Informe quantos rounds você deseja jogar: ");
        int rounds = scan.nextInt();

        return new Jokenpo(user, IA, rounds);
    }

    public static void main(String[] args) {
        Jokenpo jokenpo = startGame();
        jokenpo.toPlay();
        jokenpo.showFinalResult();
    }
}