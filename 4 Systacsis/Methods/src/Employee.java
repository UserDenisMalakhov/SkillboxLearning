public class Employee {
    private String name;
    private int phoneNumber;
    private String email = "Не задан";

    public Employee(String name, String email){
        this.name = name;
        this.email = email;
    }
    public Employee(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Employee(String name, String email, int phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Email: " + (email.isEmpty()? "Не задан" : email));
        System.out.println("Phone number: " + ((phoneNumber > 0) ? phoneNumber : "Не задан"));
    }

}
