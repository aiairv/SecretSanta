import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicMenu {

    public  static ArrayList<User> employees = new ArrayList<>();

    public static void main(BasicMenu menu) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        AdminMenu adminMenu = new AdminMenu();
        UserMenu userMenu = new UserMenu();


        Admin admin = new Admin("Aidai", "aidai123", "1234qwer", "admin");
        User firstUser = new User("Erlan", "erlan123", "123qwe", "user");
        User secondUser = new User("Nurma", "murma123", "12qw", "user");
        ArrayList<Person> persons = new ArrayList<>();
        employees.add(firstUser);
        employees.add(secondUser);
        persons.add(admin);
        while (true) {
            System.out.println("Добро пожаловать в меню");
            System.out.println("1 - Register");
            System.out.println("2 - Entry");
            System.out.println("Any key to exit");
            int command = scan.nextInt();
            if (command == 1) {
                User user = new User();
                System.out.println("Name");
                user.setName(scan.next());
                System.out.println("Login");
                user.setLogin(scan.next());
                System.out.println("Password");
                user.setPassword(scan.next());
                user.setRole("user");
                employees.add(user);
                System.out.println(persons);
            } else if (command == 2) {
                System.out.println("login");
                String login = scan.next();
                System.out.println("password");
                String password = scan.next();
                User person = new User(login, password);
                employees.add(person);
                for (Person user : employees) {
                    if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                        if (user.getRole().equals("admin")) {
                            AdminMenu.main(adminMenu);
                        } else if (user.getRole().equals("user")) {
                            UserMenu.main(userMenu);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}