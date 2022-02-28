package src.Lesson_2;

public class Task_2 {
    public static void main(String[] args) {
        //Переменные для последних задач примитивный типы
        int a = 4;
        int b = 8;
        int c = 10;
        int d = 15;
        String text = "Я стал паравозиком!";

        System.out.println("Задание : Создать объект типа Cat 2 раза.");
        Cat cat = new Cat();
        Cat cats = new Cat();
        System.out.println("Задание : Создать 3 объекта типа Dog (собака) и присвоить им имена \"Max\", \"Bella\", \"Jack\".");
        Dog dog = new Dog();
        dog.name = "Max";
        Dog dog1 = new Dog();
        dog1.name = "Belle";
        Dog dog2 = new Dog();
        dog2.name = "Jack";
        System.out.println("Задание : Напиши программу, которая выводит на экран надпись: «Мне так плохо!" +
                " Хочу, чтобы все умерли!».\n");
        System.out.println("«Мне так плохо! Хочу, чтобы все умерли!»");
        System.out.println("Задание : Закоментарь несколько строк, чтобы на экран вывелось число 19");
        //int a = 20
        //int b = 2111;
        int number = 19;
        System.out.println("Число: " + number);
        System.out.println("Задание: Создайте 10 переменных типа Cat и 8 объектов типа Cat.");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat01;
        Cat cat02;
        System.out.println("Задание: Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.\n" +
                "Присвойте каждому животному владельца (owner).");
        Cat cat001 = new Cat();
        Dog dog001 = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        Woman owner = new Woman();
        cat001.owner = owner;
        dog001.owner = owner;
        fish.owner = owner;
        System.out.println("Задание : Написать функцию, которая возвращает минимум из двух чисел.");
        System.out.println(min(a,b));
        System.out.println("Задание: Написать функцию, которая вычисляет максимум из двух чисел.");
        System.out.println(max(a,b));
        System.out.println("Задание: Написать функцию, которая вычисляет минимум из трёх чисел.");
        System.out.println(min(a,b,c));
        System.out.println("Задание: Написать функцию, которая вычисляет минимум из четырёх чисел.\n" +
                "Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)");
        System.out.println((min(a,b,c,d)));
        System.out.println("Задание: Написать функцию, которая выводит переданную строку на экран три раза, " +
                "каждый раз с новой строки.");
        wordText(text);
        System.out.println("Задание: Написать функцию, которая выводит переданную строку (слово) на экран три раза," +
                " но в одной строке. " +
                "Слова должны быть разделены пробелом и не должны сливаться в одно.");
        noWordText(text);

    }
    // функция минимум двух чисел
    public static int min(int a,int b) {
        int m = 0;
        if (a > b) m = b;
        else m = a;
        return m;
    }
    // функция максимум двух чисел
    public static int max(int a,int b) {
        int m = 0;
        if (a > b) m = a;
        else m = b;
        return m;
    }
    //функция минимум из трёх чисел
    public static int min(int a,int b , int c) {
        int m = 0;
        if (a < b) if (a < c) m = a;
        else if (b < a) if (b < c) m = b;
        else m = c;
        return m;
    }
    //функция вычисляет минимум из четырёх чисел
    public static int min(int a, int b , int c , int d) {
        int m0 = 0;
        int normal = min(a,b);
        if ((normal < c) && (normal < d)) m0 = normal;
        if ((normal > c) && (normal > d)) m0 = normal;
        if (c < d) m0 = c;
        else return d;
        return m0;

    }
    //функция выводит то что передано текст или строку и три раза печатает с новой строки
    public static void wordText(String text){
        System.out.println(text + "\n" + text + "\n" + text);
    }
    //функция выводит то что передано текст или строку и три раза печатает в одной строке с пробелами
    public static void noWordText(String text){
        System.out.println(text + " " + text + " " + text);
    }

}


