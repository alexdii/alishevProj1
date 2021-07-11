package alishev.beginner2;
import java.util.Scanner;
public class switchAdv {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("введите свой возраст");
        int age = scr.nextInt();
        switch(age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("тебе пора идти в армию");
                break;
            case 50:
                System.out.println("ты Лёха");
                break;
            default:
                System.out.println("твой возраст не подходит по условиям задачи");

        }

    }
}
