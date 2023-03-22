package alishev.beginner;

import java.util.Scanner;

public class TestFilesForPont {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("введите свой возраст");
        int age = scr.nextInt();
        switch (age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("тебе пора идти в армию");
                break;
            case 52:
                System.out.println("ты Лёха");
                break;
            //default:
                //System.out.println("твой возраст не подходит по условиям задачи");
        }
        if (age>=65 && age<90) {
            System.out.println("Ты пенсионер");
        }else if (age>20 && age<65) {
            System.out.println("иди работай");
        }else if(age>18 && age<=20) {
            System.out.println("ты служишь в армии");
        }else if(age>7 && age<18) {
            System.out.println("ты учишься в школе");
        }else if(age>2 && age<7) {
            System.out.println("ты пошел в детский сад");
        }else if(age>0 && age<=2) {
            System.out.println("ты маленький ребенок");
        }else if(age>=90 && age<=120) {
            System.out.println("ты долгожитель и получаешь хорошую пенсию");
        }else if(age>120) {
            System.out.println("так не бывает");
        }
    }
}
