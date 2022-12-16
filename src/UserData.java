import java.io.FileNotFoundException;
import java.util.*;

public class UserData {

    Scanner scanner = new Scanner(System.in);
    PresentCategory presentCategory;
    UserMenu userMenu = new UserMenu();
    Main main = new Main();

    public PresentCategory fillForm() throws FileNotFoundException {
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();
        System.out.println("Чем вы увлекаетесь?");
        String hobby = scanner.next();
        System.out.println("Выбери категорию подарка по номеру: " + "\n" +
                "    1.ELECTRONICS,\n" +
                "    2.FOOD,\n" +
                "    3.BOOKS,\n" +
                "    4.CLOTHES,\n" +
                "    5.SURPRISE");
        int category = scanner.nextInt();
        if (category == 1) {
            System.out.println("вы выбрали электронику");
            userMenu.main(userMenu);
        } else if (category == 2) {
            System.out.println("вы выбрали еду");
            userMenu.main(userMenu);
        } else if (category == 3) {
            System.out.println("вы выбрали книги");
            userMenu.main(userMenu);
        } else if (category == 4) {
            System.out.println("вы выбрали одежду");
            userMenu.main(userMenu);
        } else if (category == 5) {
            System.out.println("сюрприз");
            userMenu.main(userMenu);
        } else if (category == 0) {
            UserMenu.main(userMenu);
        }
        return null;
    }


    public void random() {
        Map<Integer, String> employees = new HashMap<>();
        int counter = 1+1;
        employees.put(counter, userMenu.getName());

        Set<Integer> setKeyEmployees = employees.keySet();
        List<Integer> listKeyEmployees = new ArrayList<>(setKeyEmployees);

        List<Integer> guests = new ArrayList<>(setKeyEmployees);
        Collections.shuffle(guests);

        for (int i = 0; i < listKeyEmployees.size(); i++) {
            if (listKeyEmployees.get(i) == guests.get(i)) {
                if (i + 1 < listKeyEmployees.size()) {
                    Integer receiver = guests.get(i + 1);
                    guests.set(i + 1, guests.get(i));
                    guests.set(i, receiver);
                } else {
                    Integer receiver = guests.get(1);
                    guests.set(1, guests.get(i));
                    guests.set(i, receiver);
                }
            }
        }
        for (int j = 0; j < listKeyEmployees.size(); j++)
            System.out.println(employees.get(listKeyEmployees.get(j)) + " дарит подарок --> " + employees.get(guests.get(j)));
    }
}
//    class Present {
//        public static void main(String args[]) {
//            int playerNumber = 10;
//            List<Integer> players = new ArrayList<>();
//            for (int i = 0; i < playerNumber; ) {
//                players.add(++i);
//            }
//            boolean shuffled = false;
//            outer:
//            while (!shuffled) {
//                Collections.shuffle(players);
//                shuffled = true;
//                for (int j = 0; j < players.size(); j++) {
//                    if (j + 1 == players.get(j)) {
//                        shuffled = false;
//                        continue outer;
//                    }
//                }
//            }
//            for (int j = 0; j < players.size(); j++)
//                System.out.println(j + 1 + " дарит подарок -> " + players.get(j));
//        }
//    }

