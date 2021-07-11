package alishev.beginner;
import java.util.Scanner;
public class SwString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введи свой возраст буквами");
        String age = scan.nextLine();
        switch(age) {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("тебе пора идти в армию");
                break;
            default:
                System.out.println("твой возраст не подходит под условия задачи");

        }
    }
}
