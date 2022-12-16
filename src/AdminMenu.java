import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminMenu {
    public static void main(AdminMenu admin) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        UserData userData = new UserData();
        AdminData adminData = new AdminData();
        BasicMenu basicMenu = new BasicMenu();
        while (true) {
            System.out.println("Добро пожаловать в меню для админа");
            System.out.println("1 - Задать макисмальную сумму");
            System.out.println("2 - Добавить инструкцию");
            System.out.println("3 - Выберите дату окночания игры и время обмена подарками");
            System.out.println("4 - Посмотреть анкету участников");
            System.out.println("0 - Выход");
            int command = scan.nextInt();
            if (command == 1) {
                adminData.setMaxSum();
            } else if (command == 2) {
                adminData.addGameCondition();
            } else if (command == 3) {
                adminData.setDateEndOfGame();
            } else if (command == 4) {
//                FileReader fileReader = new FileReader("SecretSanta2.txt");
            } else if (command == 0) {
                BasicMenu.main(basicMenu);
            }

            try{
                FileWriter fileWriter = new FileWriter("SecretSanta.txt");
                fileWriter.write(adminData.setMaxSum() + "\n");
                fileWriter.write(adminData.addGameCondition() + "\n");
                fileWriter.write(adminData.setDateEndOfGame() + "\n");
                fileWriter.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }

            try{
                FileReader fileReader = new FileReader("SecretSanta.txt");
                scan.next(String.valueOf(fileReader));
                int i = 1;
                while(scan.hasNextLine()){
                    System.out.println(i + " - строка: " + scan.nextLine());
                }
                fileReader.close();
            }
            catch (IOException notFoundException) {
                System.out.println(notFoundException.getMessage());
            }
        }
    }
}
