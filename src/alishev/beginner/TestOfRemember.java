package alishev.beginner;

import java.util.Scanner;

public class TestOfRemember {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("input your age: ");
        int age1 = scan1.nextInt();
        if (age1 >= 50) {
            System.out.println("your are is very old, already " + age1);
        } else {
            System.out.println("your are little, your age is " + age1);
        }


    }

}
