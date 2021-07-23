package alishev.beginner;

import java.util.Scanner;                                   //need to import Scanner

public class DifficultIf {                                  // class
    public static void main(String[] args) {                // method
        Scanner sc1 = new Scanner(System.in);               // do not work without import from library
        System.out.println("Введите первое число: ");
        int a = sc1.nextInt();                              //  declaration
        System.out.println("Ваше первое число: " + a);
  //      Scanner sc2 = new Scanner(System.in);               // System.in - input, System.out - output
        System.out.println("Введите второе число: ");
        int b = sc1.nextInt();                              // sc2.nextLine() was here before, I can't see any changes!!!   ???
        System.out.println("Ваше второе число: " + b);
        if (a > b) {
            System.out.println("Первое число больше второго!");
        } else if (a < b) {
            System.out.println("Второе число больше первого!");
        } else {
            System.out.println("Вы ввели два одинаковых числа!");
        }

    }

}
