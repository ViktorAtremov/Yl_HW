package src.ylab_viktor.additional_task;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
          int fib1 = 1;
         int fib2 = 1;

         int i = 0;
        System.out.println("Введите число элемента: ");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();

        while (i < n - 2 ) {
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            i += 1;
        }
        sr.close();
        System.out.println("Результат: " + fib2);

    }
}
