package HW4_28_6_2023_NOP.Manage_Caro;

import java.util.Scanner;


public class Game {
    Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Board board = new Board();

    public Game() {
        
    }
    
    public Game(Player player1, Player player2 ){
        this.player1 = player1;
        this.player2 = player2;
    }

    // setter and getter
    public Player getPlayer1() {
        return player1;
    }


    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }


    public Player getPlayer2() {
        return player2;
    }


    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }


    public Board getBoard() {
        return board;
    }


    public void setBoard(Board board) {
        this.board = board;
    }

    // Play game
    public void play(){
        System.out.println("==========================Play Game Tic Tac Toe========================");
        // Boolean checkBoardFull = board.isFull();
        // System.out.println(board.getBoard());
        board.instructionBoard();
        while(!board.isFull() == true){
            System.out.println("TESSTTTT: "+ !board.isFull());
            int row, col, row2, col2;
            do {
                System.out.println("Turn Player 1 (press position you want And Show 'O'): ");
                System.out.println("Nhap row (0, 1, 2): ");
                row = sc.nextInt();
                System.out.println("Nhap col (0, 1, 2): ");
                col = sc.nextInt();
            } while (!board.checkDuplicate(row, col));
            
            board.markTable(row, col, player1);
            board.displayBoard();
            // board[]
            System.out.println();
            if (!board.isFull() != false){
                System.out.println("=============> Change Turn");

                do {
                    System.out.println("Turn Player 2 (press position you want And Show 'X'): ");
                    System.out.println("Nhap row (0, 1, 2): ");
                    row2 = sc.nextInt();
                    System.out.println("Nhap col (0, 1, 2): ");
                    col2 = sc.nextInt();
                } while (!board.checkDuplicate(row2, col2));
                
                board.markTable(row2, col2, player2);
                board.displayBoard();
            }else{
                break;
            }
        }
    }

}
