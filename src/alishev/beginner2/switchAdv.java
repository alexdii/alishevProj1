package alishev.beginner2;
import java.util.Scanner;
public class switchAdv {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("input your age");
        int age = scr.nextInt();
        switch(age) {
            case 0:
                System.out.println("your birthday today");
                break;
            case 7:
                System.out.println("you are going to school");
                break;
            case 18:
                System.out.println("time for army now");
                break;
            case 52:
                System.out.println("you are Alex");
                break;
            //default:
            //    System.out.println("твой возраст не подходит по условиям задачи");
        }
        if(age>=65) {                            // insert if
            System.out.println("pension");
        }else if(age>20) {
            System.out.println("go job, nigga!");
        }else if(age>18){
            System.out.println("army serve");
        }else if(age>7 && age<18){                         //  двойное условие    7<age<18
            System.out.println("school time");
        }else if(age>2 && age<7){
            System.out.println("child-garden");
        }else if(age>0 && age<=2) {
            System.out.println("baby");
        }
    }
}
