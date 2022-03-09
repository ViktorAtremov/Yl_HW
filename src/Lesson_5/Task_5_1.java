package src.Lesson_5;

public class Task_5_1 {
    public static void main(String[] args) {
        //Задачи на создание своих классов и объектов
        System.out.println("Задача: Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int)," +
                " вес (weight, int), сила (strength, int).");
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.age = 32;
        cat.weight = 24;
        cat.strength = 124;

        Cat cat1 = new Cat();
        cat1.name = "Пушок";
        cat1.age = 12;
        cat1.weight = 134;
        cat1.strength = 70;

        System.out.println("Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса," +
                "возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. " +
                "возвращать true, если выиграли и false - если нет.\n" +
                "Должно выполняться условие:\n" +
                "если cat1.fight(cat2) == true , то cat2.fight(cat1) == false");
        System.out.println(cat.fight(cat1));
        System.out.println(cat1.fight(cat));

        System.out.println("Создать class Dog. У собаки должна быть кличка String name и возраст int age.\n" +
                "Создайте геттеры и сеттеры для всех переменных класса Dog.");

        Dog dog = new Dog();
        dog.setName("Барбос");
        dog.setAge(25);

        System.out.println("Задание: В методе main создать три объекта типа Cat и заполнить их данными. " +
                "Использовать класс Cat из первой задачи. Класс Cat создавать не надо.");
        //принципе два создано Cat создано создам третие тут

        Cat cat2 = new Cat();
        cat2.name = "Агент Котяра 007";
        cat2.age = 33;
        cat2.weight = 124;
        cat2.strength = 3124;

        System.out.println("Задание: Создать три кота используя класс Cat.\n" +
                "Провести три боя попарно между котами.\n" +
                "Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).\n" +
                "Результат каждого боя вывести на экран.\n ");
        //принципе у нас Котов созданы устроем бои
        System.out.println(cat.fight(cat1));
        System.out.println(cat.fight(cat2));
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
