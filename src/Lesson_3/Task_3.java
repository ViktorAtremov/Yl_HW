package src.Lesson_3;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Задание: Вывести на экран дату своего рождения в виде: MAY 1 2012");
        System.out.println("AUGUST 31 1996");

        System.out.println("Задание: 4 скобки Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850: " +
                " 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 +14 +15");
        System.out.println(1 + 2 * (3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 * 11 + 12 * 13 + 14) + 15);

        System.out.println("Задание: StarCraft Создать 10 зергов, 5 протосов и 12 терран. Дать им всем уникальные имена.");
        Zerg zero1 = new Zerg();
        Zerg zero2 = new Zerg();
        Zerg zero3 = new Zerg();
        Zerg zero4 = new Zerg();
        Zerg zero5 = new Zerg();
        Zerg zero6 = new Zerg();
        Zerg zero7 = new Zerg();
        Zerg zero8 = new Zerg();
        Zerg zero9 = new Zerg();
        Zerg zero10 = new Zerg();

        zero1.name = "01a";
        zero2.name = "02a";
        zero3.name = "03a";
        zero4.name = "04a";
        zero5.name = "05a";
        zero6.name = "06a";
        zero7.name = "07a";
        zero8.name = "08a";
        zero9.name = "09a";
        zero10.name = "10a";

        Protos proton1 = new Protos();
        Protos proton2 = new Protos();
        Protos proton3 = new Protos();
        Protos proton4 = new Protos();
        Protos proton5 = new Protos();

        proton1.name = "Protos_01";
        proton2.name = "Protos_02";
        proton3.name = "Protos_03";
        proton4.name = "Protos_04";
        proton5.name = "Protos_05";

        Teran ter1 = new Teran();
        Teran ter2 = new Teran();
        Teran ter3 = new Teran();
        Teran ter4 = new Teran();
        Teran ter5 = new Teran();
        Teran ter6 = new Teran();
        Teran ter7= new Teran();
        Teran ter8 = new Teran();
        Teran ter9 = new Teran();
        Teran ter10 = new Teran();
        Teran ter11 = new Teran();
        Teran ter12 = new Teran();

        ter1.name = "Reinor";
        ter2.name = "Mengs";
        ter3.name = "Teror01";
        ter4.name = "MeTeror02";
        ter5.name = "Rsds2";
        ter6.name = "MengssdsdDSD";
        ter7.name = "ReinorWOLD";
        ter8.name = "MengsMoore";
        ter9.name = "Nullow";
        ter10.name = "Teraran_007";
        ter11.name = "Taran_0001";
        ter12.name = "Bo_001";

        System.out.println("Задание : Произведение 10 чисел Вывести на экран произведение чисел от 1 до 10. " +
                "Подсказка: будет три миллиона с хвостиком ");
        System.out.println(1*2*3*4*5*6*7*8*9*10);

        System.out.println("Задание: Сумма 10 чисел Вывести на экран сумму чисел от 1 до 10 построчно");
        //тут я решил использовать цикл чтобы сократить код
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a += i;
            System.out.println(a);
        }
        System.out.println("Задание: Мама мыла раму Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».\n" +
                "Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.");
        String [] te = {"Мама" , "Мыла", "Раму"};

        System.out.println( te[0] + te[1] + te[2] + "\n" +
                            te[1] + te[0] + te[2] + "\n" +
                            te[1] + te[2] + te[0] + "\n" +
                            te[2] + te[1] + te[0] + "\n" +
                            te[0] + te[2] + te[1] + "\n" +
                            te[2] + te[0] + te[1]);

        System.out.println("Задание: Выведи на экран таблицу умножения 10 на 10 в следующем виде:\n" +
                "1 2 3 …\n" +
                "2 4 6 …");

        int l = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " " + "\t");
            }
            System.out.print(" " + "\n");
        }
        System.out.println("Задание : Cемь цветов радуги\n" +
                "\n" +
                "Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).\n" +
                "Каждый объект при создании выводит на экран определенный цвет.");
        /*
        Red (красный)
        Orange (оранжевый)
        Yellow (жёлтый)
        Green (зелёный)
        Blue (синий)
        Indigo (фиолетовый)
        Violet (пурпурный)
        */
            Coloris red = new Coloris();
            Coloris orange = new Coloris();
            Coloris yellow = new Coloris();
            Coloris green = new Coloris();
            Coloris blue = new Coloris();
            Coloris indigo = new Coloris();
            Coloris violet = new Coloris();
            red.setColorName("Red");
            orange.setColorName("Orange");
            yellow.setColorName("Yellow");
            green.setColorName("Green");
            blue.setColorName("Blue");
            indigo.setColorName("Indigo");
            violet.setColorName("Violet");

            System.out.println("цвет" + red.getColorName());
            System.out.println("цвет" + orange.getColorName());
            System.out.println("цвет" + yellow.getColorName());
            System.out.println("цвет" + green.getColorName());
            System.out.println("цвет" + blue.getColorName());
            System.out.println("цвет" + indigo.getColorName());
            System.out.println("цвет" + violet.getColorName());

            System.out.println("Задание: Про экранирование символов в Java читайте в дополнительном материале к лекции." +
                    " Вывести на экран следующий текст - две строки:\n" +
                    "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                    "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
            System.out.println("Задание: Изучаем японский\n" +
                    "\n" +
                    "Выведи на экран 日本語");
             System.out.println("日本語");
             System.out.println(" Задание : Как захватить мир\n" +
                     "\n" +
                     "Ввести с клавиатуры число и имя, вывести на экран строку:\n" +
                     "«имя» захватит мир через «число» лет. Му-ха-ха!\n" +
                     "( Последовательность вводимых данных имеет большое значение.)");
            Scanner sr = new Scanner(in);
            System.out.print("Введите число: ");
            int number = sr.nextInt();
            System.out.print("Введите имя: ");
            String name = sr.next();
            System.out.println("«" + name +"»" + " захватит мир через " + "«" + number + "»" + " лет. Му-ха-ха!" );

            System.out.println("Задание: Зарплата через 5 лет\n" +
                    "\n" +
                    "Ввести с клавиатуры отдельно Имя, число1, число2." +
                    " Вывести надпись: «Имя» получает «число1» через «число2» лет.");
             System.out.print("Введите имя:");
             String name1 = sr.next();
             System.out.print("Ведите число 1: ");
             int num1 = sr.nextInt();
             System.out.print("Ведите число 2: ");
             int num2 = sr.nextInt();
             System.out.println(name1 + " получает " + num1 + " через " + num2 + " лет.");

             System.out.println("Задание: Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!");
             System.out.print("Введите имя:");
             String name2 = sr.next();
             System.out.println(name2 + " зарабатывает $5,000. Ха-ха-ха!");

             System.out.println("Задание: Ввести с клавиатуры два имени и вывести надпись:\n" +
                     "name1 проспонсировал name2, и она стала известной певицей.\n");

            System.out.print("Введите имя 1 :");
            String name3 = sr.next();
            System.out.print("Введите имя 2 :");
            String name4 = sr.next();
            System.out.println(name3 + " пронспорсировал " + ", и она стала известной певицей");

            System.out.println("Задание : Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!");
            System.out.print("Введите имя 1:");
            String name01 = sr.next();
            System.out.print("Введите имя 2:");
            String name02 = sr.next();
            System.out.print("Введите имя 3:");
            String name03 = sr.next();
            System.out.println(name01 + " + " + name02 + " + " + name03 + " = " + "Чистая любовь, да-да!" );

            System.out.println("Задание: Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»");
            System.out.println("Жить хорошо, а хорошо жить еще лучше");

            System.out.println("Задание :Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»");
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");

            System.out.println("Задание: Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».");
            System.out.print("Ведите число n: ");
            int n = sr.nextInt();
            System.out.println("Я буду зарабатывать " + "$" + n + " в час");
            sr.close();



    }

}
