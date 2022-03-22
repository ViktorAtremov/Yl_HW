package src.Lesson_7;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Task_7_1_1 {

    public static void main(String[] args) {

    }

    // Задание : 1. В методе initializeArray():
    //1.1. Создайте массив на 20 чисел
    //1.2. Считайте с консоли 20 чисел и заполните ими массив
    //2. Метод max(int[] array) должен находить максимальное число из элементов массива
    void initializeArray() {
        int[] arr = new int[20];
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i <= 20; i++) {
            System.out.print("Введите число, элемента массива " + i + "= ");
            int j = sr.nextInt();
            arr[i] = j;
        }

    }


}
