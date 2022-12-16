import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserMenu extends Person {
    public static void main(UserMenu user) throws FileNotFoundException {
        UserData userData = new UserData();
        AdminMenu adminMenu = new AdminMenu();
        Scanner scan = new Scanner(System.in);
        BasicMenu basicMenu = new BasicMenu();
        while (true) {
            System.out.println("Добро пожаловать в игру!");
            System.out.println("1 - Заполнить анкету");
            System.out.println("2 - Узнать кому сделать подарок");
            System.out.println("3 - Данные об игре");
            System.out.println("0 - Выход");
            int command = scan.nextInt();
            if (command == 1) {
                userData.fillForm();
            } else if (command == 2) {
                userData.random();
            } else if (command == 3) {
                new FileReader("SecretSanta.txt");
            } else if (command == 0) {
                BasicMenu.main(basicMenu);
            }

            try {
                FileWriter fileWriter = new FileWriter("SecretSanta2.txt");
                fileWriter.write(userData.fillForm().ordinal());
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try {
                FileReader fileReader = new FileReader("SecretSanta2.txt");

                int i = 1;
                while (scan.hasNextLine()) {
                    System.out.println(i + " - строка: " + scan.nextLine());
                }
                fileReader.close();
            } catch (IOException notFoundException) {
                System.out.println(notFoundException.getMessage());
            }
        }
    }
}


