package HW4_28_6_2023_NOP.Manage_Caro;

public class Player {
    private String playerName;
    private int age;
    private String idPlayer;
    private char mark;

    public Player(String playerName, int age, String idPlayer, char mark) {
        this.playerName = playerName;
        this.age = age;
        this.idPlayer = idPlayer;
        this.mark = mark;
    }

    public String getPlayerName() {
        return playerName;
    }



    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getIdPlayer() {
        return idPlayer;
    }



    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }



    public char getMark() {
        return mark;
    }



    public void setMark(char mark) {
        this.mark = mark;
    }

    public void displayPlayer(){
        System.out.println("Player "+idPlayer+" : " + "[ " + playerName + ", " + age + " ]");
    }

}
