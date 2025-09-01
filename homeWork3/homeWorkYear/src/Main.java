import java.util.Scanner;
import ru.netology.service.CheckYear;
import ru.netology.service.Cap;
public class Main {
    public static void main(String[] args) {
        Cap.cap();
        int totalScore = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("ВВедите год в формате уууу: ");
            int year = scanner.nextInt();
            System.out.print("ВВедите кол-во дней в году: ");
            int day = scanner.nextInt();
            int score = CheckYear.checkYear(year,day);
            totalScore += score;
            if(score == 0){
                Cap.footer();
                System.out.println("КОНЕЦ!!!");
                System.out.println("СЧЕТ ИГРЫ: " + totalScore);
                break;
            }

        }
    }
}
