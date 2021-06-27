package alishev.beginner;

import java.util.Scanner;

public class InputScanString {

    public static void main(String[] args) {

        String str = new String("New string for testing and training.");
        System.out.println(str);
        Scanner s = new Scanner(System.in);
        System.out.println("Input something: ");
        String string = s.nextLine();
        System.out.println("You are input: "+string);

    }
}