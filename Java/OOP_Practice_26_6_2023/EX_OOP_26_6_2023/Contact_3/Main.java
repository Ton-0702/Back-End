package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Contact_3;

public class Main {
    public static void main(String[] args) {
        Contact friend = new FriendContact("Tu", "113114115");
        friend.getName();
        friend.getPhoneNumber();
        friend.displayContactInfo();
        Contact work = new workContact("Toan", "113114116");
        work.getName();
        work.getPhoneNumber();
        work.displayContactInfo();
    }
}
