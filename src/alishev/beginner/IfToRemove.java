package alishev.beginner;
import java.util.Scanner;
public class IfToRemove {
    public static void main(String[] args) {

// todo: добавить функционал ввода данных с клавиатуры

        int a;
        int b;
        a = 5;
        b = 3;
        if(a>b) {
            System.out.println("a more than b");
        } else if(a<b) {
            System.out.println("a less than b");
        } else {
            System.out.println("a equal b");
        }
    }

}
