package alishev.beginner2;
import java.util.Scanner;
public class switchAdv {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("введите свой возраст");
        int age = scr.nextInt();
        if(age>=65) {                            // insert if
            System.out.println("ты пенсионер");
        }else if(age>=20) {
            System.out.println("иди работай!");
        }else if(age>=18){
            System.out.println("ты пошел в армию");
        }else if(age>7){
            System.out.println("ты учишься в школе");
        }else if(age>0){
            System.out.println("ты пошел в детский сад");
        }
        switch(age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 50:
                System.out.println("ты Лёха");
                break;
            //default:
            //    System.out.println("твой возраст не подходит по условиям задачи");

        }

    }
}
