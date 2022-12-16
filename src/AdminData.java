import java.util.Scanner;

public class AdminData {
    Scanner scan = new Scanner(System.in);
    private String maxSum;
    private String addInstructions;
    private String gameEndDate;
    private String viewTheProfile;


    public String getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(String maxSum) {
        this.maxSum = maxSum;
    }

    public String getAddInstructions() {
        return addInstructions;
    }

    public void setAddInstructions(String addInstructions) {
        this.addInstructions = addInstructions;
    }

    public String getGameEndDate() {
        return gameEndDate;
    }

    public void setGameEndDate(String gameEndDate) {
        this.gameEndDate = gameEndDate;
    }

    public String getViewTheProfile() {
        return viewTheProfile;
    }

    public void setViewTheProfile(String viewTheProfile) {
        this.viewTheProfile = viewTheProfile;
    }

    public int setMaxSum(){
        System.out.println("Введите максимальную сумму подарка!");
        String sum = scan.nextLine();
        System.out.println(sum);
        return 0;
    }

    public int addGameCondition(){
        System.out.println("Установите правила игры!");
        String condition = scan.nextLine();;
        System.out.println(condition);
        return 0;
    }

    public int setDateEndOfGame(){
        System.out.println("Установите дату окончания игры!");
        String endGame = scan.nextLine();
        System.out.println(endGame);
        return 1;
    }
}
