package alishev.beginner;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("введи возраст");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        switch(age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончил школу и тебе пора в армию или в институт");
                break;
            default:
                System.out.println("ни одно из перечисленных условий не подошло");
        }

    }
}
