package HW4_28_6_2023_NOP.Manage_Caro;

public class Board {
    private char[][] board;

    public Board() {
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public Board(char[][] board) {
        this.board = board;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    
    public void instructionBoard(){
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");
    }

    public void displayBoard(){
        System.out.println("|-----------|");
        for (int i = 0; i < 3; i++) {
            StringBuilder rowDisplay = new StringBuilder("| ");
            for (int j = 0; j < 3; j++) {
                // System.out.println("| "+ board[i][j]); //board[i][j]
                rowDisplay.append(board[i][j]);
                rowDisplay.append(" | ");
            }
            System.out.println(rowDisplay);
        }
        System.out.println("|-----------|");
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    System.out.println("hello: "+ board[i][j]);
                    return false;
                }
            }
        }
        return true;
    }

    // Đánh dấu vào bảng
    public void markTable(int row, int col, Player player){
        if(player == "Player1"){
            board[row-1][col-1] = 'O';
        }else{
            board[row-1][col-1] = 'X';
        }
    }

    // check điều kiện đã đánh dấu
    public boolean checkDuplicate(int row, int col){
        // System.out.println();
        if ((row-1 < 0 || row-1 > 2) || (col-1 <0 || col-1 >2)){
            System.out.println();
            System.out.println("Ban da nhap Ngoai Pham Vi => Vui long nhap lai");
            System.out.println();
            displayBoard();
            return false;
        }
        
        if(board[row-1][col-1] != '-'){
            System.out.println();
            System.out.println("Ban da nhap trung vi tri Mark Hoac  => Vui long nhap lai");
            System.out.println();
            displayBoard();
            return false;
        }
        return true;
    }

    public boolean checkWin(Player player){
        for (int i = 0; i < 3; i++) {
            if(board[i][0] )
        }
    }
    
}
