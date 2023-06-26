package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Contact_3;

public class workContact implements Contact{
    private String name;
    private String phone;

    public workContact(String name, String phone){
        this.name = name;
        this.phone =phone;
    }

    @Override
    public void getName() {
        // TODO Auto-generated method stub
        System.out.println("Work Contact "+name);
    }

    @Override
    public void getPhoneNumber() {
        // TODO Auto-generated method stub
        System.out.println("Work Contact Phone "+phone);
    }

    @Override
    public void displayContactInfo() {
        // TODO Auto-generated method stub
        System.out.println("Work Contact "+name +" and Phone Number is "+phone);
    }
    
}
