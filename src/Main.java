import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BasicMenu basicMenu = new BasicMenu();
        Scanner scan = new Scanner(System.in);

        while (true) {
            int command;
            System.out.println("Нажмите 1 для входа");
            command = scan.nextInt();
            if (command == 1) {
                BasicMenu.main(basicMenu);
            } else {
                break;
            }
        }
    }
}
