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
            case 51:
                System.out.println("ты Лёха");
                break;
            //default:
            //    System.out.println("твой возраст не подходит по условиям задачи");
        }
        if(age>=65) {                            // insert if
            System.out.println("ты пенсионер");
        }else if(age>20) {
            System.out.println("иди работай!");
        }else if(age>18){
            System.out.println("ты служишь в армии");
        }else if(age>7 && age<18){                         //  двойное условие    7<age<18
            System.out.println("ты учишься в школе");
        }else if(age>2 && age<7){
            System.out.println("ты пошел в детский сад");
        }else if(age>0 && age<=2) {
            System.out.println("ты маленький ребенок");
        }
    }
}
