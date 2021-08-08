package alishev.beginner2;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i<=15; i++) {
            if(i%2==0) {
                continue; // все, что находится после continue не выполняется 
                // цикл начинается сначала. условие не выполняется - не выполняется continue.
                // условие выполняется - выполняется continue и цикл выполняется сначала.
            }
            System.out.println("это нечетное число: "+i);
        }

    }

}
