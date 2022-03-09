package src.Lesson_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Задание: Ввести с клавиатуры два числа, и вывести на экран минимальное из них.");
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sr.nextInt();
        System.out.println("Введите число b: ");
        int b = sr.nextInt();
        //Проверка на одинаковые значения и повторный запрос ввода данных
        if (a == b) {
            System.out.println("Ведите пожалуиста разные числа");
            System.out.println("Введите число a: ");
            int c = sr.nextInt();
            System.out.println("Введите число b: ");
            int d = sr.nextInt();
        }
        int min = Math.min(a, b);
        System.out.println("Минимальное число : " + min);

        System.out.println("Задание: Ввести с клавиатуры четыре числа, и вывести максимальное из них.");
        System.out.println("Введите число 1");
        int a1 = sr.nextInt();
        System.out.println("Введите число 2");
        int a2 = sr.nextInt();
        System.out.println("Введите число 3");
        int a3 = sr.nextInt();
        System.out.println("Введите число 4");
        int a4 = sr.nextInt();
        int a0 = Math.max(a1, a2);
        int a00 = Math.max(a3, a4);
        if (a0 > a00) {
            System.out.println("Максимальное число: " + a0);
        } else {
            System.out.println("Максимальное число: " + a00);
        }

        System.out.println("Задание: Ввести с клавиатуры три числа, и вывести их в порядке убывания.");
        System.out.println("Введите первое число: ");
        int number1 = sr.nextInt();
        System.out.println("Введите всторое число: ");
        int number2 = sr.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = sr.nextInt();

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println(number1 + "," +  number2 + "," + number3);
            } else {
                System.out.println(number1 + "," +  number3 + "," + number2);
            }
        }
        else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.println(number2 + "," +  number1 + "," + number3);
            } else {
                System.out.println(number2 + "," +  number3 + "," + number1);
            }
        }
        else if (number3 > number1 && number3 > number2) {
            if (number1 > number2) {
                System.out.println(number3 + "," +  number1 + "," + number2);
            } else {
                System.out.println(number3 + "," + number2 + "," + number1);
            }
        }
        System.out.println("Задание: Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».\n" +
                "Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».");
        String names = sr.next();
        String names2 = sr.next();
        if (names.equals(names2)) {
            System.out.println("Имена идентичны");
        } else if (names.length() == names2.length()){
            System.out.println("Длины имен равны");
        }

        System.out.println("Задание: Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»");
        System.out.println("Введите свое имя: ");
        String name = sr.next();
        System.out.println("Введите возраст свой : ");
        int nyears = sr.nextInt();
        if (nyears < 18) {
            System.out.println("Пожрасти ещё");
        }
        System.out.println("Задание: Ввести с клавиатуры имя и возраст.\n" +
                "Если возраст больше 20 вывести надпись «И 18-ти достаточно»");
        System.out.println("Введите свое имя");
        String name1 = sr.next();
        System.out.println("Введите свое возраст");
        int syers = sr.nextInt();
        if (syers > 20) System.out.println(name1 + ". И 18-ти достаточно");


        System.out.println("Задание:Вывести на экран числа от 1 до 10, используя цикл while. ");
        int az = 0;
        while (az <= 9)
        {
            az++;
            System.out.println(az);
        }
        System.out.println("Задание: Вывести на экран числа от 10 до 1, используя цикл while. ");
        int a11 = 11;
        while (a11 > 1)
        {
            a11--;
            System.out.println(a11);
        }
        System.out.println("Задание: Ввести с клавиатуры строку и число N.\n" +
                "Вывести на экран строку N раз, используя цикл while. ");
        System.out.println("Введите строку, которую хотите повторить N раз");
        String str = sr.next();
        System.out.println("Введите N-число: ");
        int N = sr.nextInt();
        int nell = 0;
        while (nell <= N) {
            nell++;
            System.out.println(str);
        }

        System.out.println("Задание: Вывести на экран квадрат из 10х10 букв S используя цикл while.\n" +
                "Буквы в каждой строке не разделять.");
        int soll = 0;

        while  (soll <= 9) {
            soll++;
          System.out.println("SSSSSSSS");
        }
        System.out.println("Задание: Вывести на экран таблицу умножения 10х10 используя цикл while.\n" +
                "Числа разделить пробелом.\n");
        int i=1,n=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            while(n<=9)
            {
                n++;
                System.out.print("\t"+ i*n + " ");
            }
            i++;
            n=1;
            System.out.println("\t");
        }


    }
}
