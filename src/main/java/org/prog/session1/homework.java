package org.prog.session1;


public class homework {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 || number % 7 == 0 || number % 13 == 0) {
                System.out.println(number);
            }
        }
    }
}