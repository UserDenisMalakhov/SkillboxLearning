import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
       User userMasha = new User("Masha",22);
       User userSasha = new User("Sasha", 30);
       User userDima = new User("Dima", 90);

       printUserInfo(userDima);
       printUserInfo(userMasha);
       printUserInfo(userSasha);
       printCurrentDateTime();

    }
    public static void printUserInfo(User user){
        System.out.println("User: " + user.getName() + ", " + user.getAge());
    }

    public static void printCurrentDateTime() {
        System.out.print("Дата и время: ");
        System.out.println(LocalDateTime.now());

    }

}