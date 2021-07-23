package alishev.beginner;

import java.util.Scanner;

public class AfterRest {
    public static void main(String [] args) {
        System.out.println("Введите число не более 4: ");
        Scanner scan = new Scanner(System.in);
        int arg = scan.nextInt();
        if (arg<4) {
            System.out.println("Вы ввели "+arg+". Это правильно, "+arg+" меньше 4.");
        }else if(arg>4){
            System.out.println("Вы ввели число "+arg+ ", а оно больше 4!");
        }else{
            System.out.println("Вы ввели "+arg+".");
        }



    }
}
