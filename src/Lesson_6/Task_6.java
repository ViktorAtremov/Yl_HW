package src.Lesson_6;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("В классе Cat создать метод protected void finalize() throws Throwable");
        Cat cat = new Cat();

        System.out.println("В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.");
        System.out.println("Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).");
        for (int i = 1; i <= 50; i++){
            Cat cat1 = new Cat();
            Dog dpg1 = new Dog();


        }

        System.out.println("\n" +
                "В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную catCount этого же класса) на 1. В методе finalize уменьшать на 1.");


    }

}
