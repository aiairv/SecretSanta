import java.util.Scanner;

public class Admin  extends Person {
    Scanner scan = new Scanner(System.in);
    private String name;
    private String login;
    private String password;
    private String role;

    public Admin(String name, String login, String password, String role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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





//    public void adminRegister(Login login) {
//        System.out.println("Введите логин");
//        scan.nextLine();
//
//        for (int i = 0; i <; i++) {
//            if (this.name.equals(getLogin())) {
//                System.out.println("Логин введен правильно");
//            } else {
//                System.out.println("Введите логин еще раз");
//            }
//            System.out.println("Введите пароль: ");
//            if (this.password.equals(getPassword())) {
//                System.out.println("Пароль введен правильно");
//            } else {
//                System.out.println("Введите пароль еще раз");
//            }
//        }
//
//        System.out.println();
//    }
}