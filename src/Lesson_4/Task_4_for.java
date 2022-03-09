package src.Lesson_4;

import java.util.Scanner;

public class Task_4_for {
    public static void main(String[] args) {
        System.out.println("Задание: Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.\n" +
                "Через пробел либо с новой строки.");

        for (int i = 2; i <= 100 ; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задание: Ввести с клавиатуры два числа m и n.\n" +
                "Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.\n");
        Scanner inputFor = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = inputFor.nextInt();
        System.out.print("Введите n: ");
        int n = inputFor.nextInt();
        for (int i = 0; i < m; i++) {
            for (int l = 0; l < n ; l++){
                System.out.print(n);
            }
            System.out.println(m);
        }
        System.out.println("Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.");
        String num = "8";
        for (int i = 1; i <= 10; i++) {

                num += "8";
                System.out.println(num);
        }
        System.out.println("Задание: Используя цикл for вывести на экран:\n" +
                "- горизонтальную линию из 10 восьмёрок\n" +
                "- вертикальную линию из 10 восьмёрок.");

            for (int l = 1; l <= 10; l++) {
                System.out.println("8");
            }
        for (int i = 1 ; i <= 10; i++) {
            System.out.print("8");
        }

        System.out.println("Задание: Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]");
        System.out.print("Введите имя : ");
        String name = inputFor.next();
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " любит меня.");
        }

        //доп задания с саита внизу
        System.out.println("Задание: Используя цикл вывести на экран сто раз надпись:\n" +
                "«Я никогда не буду работать за копейки. Амиго»");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Я никогда не буду работать за копейки. Амиго");
        }
        System.out.println("Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.");
        System.out.print("Введите число 1: ");
        int a = inputFor.nextInt();
        System.out.print("Введите число 2: ");
        int b = inputFor.nextInt();
        System.out.print("Введите число 3: ");
        int c = inputFor.nextInt();
        double sr = (a + b + c) / 3;
        System.out.println("Среднее число: " + sr);
        System.out.println("Вводить с клавиатуры числа и считать их сумму. " +
                "Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.");
        int s = 0;
        for (int i = 0 ; ; i++) {
            System.out.print("Введите число для суммирования : ");
            int qa = inputFor.nextInt();
            s += qa;
            System.out.println(qa);
            if (a==-1) break;
        }
        System.out.println("Задание: Ввести с клавиатуры строку name.\n" +
                "Ввести с клавиатуры дату рождения (три числа): y, m, d.\n" +
                "Вывести на экран текст:\n" +
                "«Меня зовут name\n" +
                "Я родился d.m.y»\n");
        System.out.print("Введите имя: ");
        String names = inputFor.next();
        System.out.println("Введите год месяц день через пробел");
        int y = inputFor.nextInt();
        int mm = inputFor.nextInt();
        int d = inputFor.nextInt();
        System.out.println("Меня зовут " + names);
        System.out.println("Я родился " + y + "." + mm + "." + d);

    }
}
