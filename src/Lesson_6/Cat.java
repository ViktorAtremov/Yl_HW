package src.Lesson_6;

public class Cat {

    protected void finalize() throws Throwable {
        System.out.println("Такой обьект уничтожен");
    }
    static int catCount =+ 1;


}
