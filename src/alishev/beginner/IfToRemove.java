package alishev.beginner;
import java.util.Scanner;
public class IfToRemove {
    public static void main(String[] args) {

// todo: добавить функционал ввода данных с клавиатуры


        int a;
        int b;
        System.out.println("input a");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("input b");
        b = scan.nextInt();
        if(a>b) {
            System.out.println("a more than b");
        } else if(a<b) {
            System.out.println("a less than b");
        } else {
            System.out.println("a equal b");
        }
    }

}
