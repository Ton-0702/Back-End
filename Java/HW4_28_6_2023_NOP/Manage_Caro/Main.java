package HW4_28_6_2023_NOP.Manage_Caro;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Toan", 22, "Player1", 'O');
        Player player2 = new Player("Hieu", 25, "Player2", 'X');
        Game game = new Game(player1, player2);
        game.play();
    }
}
