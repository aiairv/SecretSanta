import java.util.Scanner;

public class User extends Person {
    Scanner scan = new Scanner(System.in);
    private String name;
    private String login;
    private String password;
    private String role;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String name, String login, String password, String role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }




//    public User register() {
//        User user = new User();
//        System.out.println("Введите имя");
//        user.setName(scan.next());
//        System.out.println("Введите логин");
//        user.setLogin(scan.next());
//        System.out.println("Введите пароль");
//        user.setPassword(scan.next());
//        System.out.println("Введите роль(user||admin)");
//        user.setRole(scan.next());
//        return user;
//    }



    @Override
    public String toString() {
        return "User= " + "name= " + name + '\n' +
                ", login= " + login + '\n' +
                ", password= " + password + '\n' +
                ", role= " + role ;
    }
}

