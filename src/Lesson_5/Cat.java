package src.Lesson_5;

public class Cat {
    private String name; //имя
    int age; // возраст
    int weight; // вес
    int strength; // сила
    String color;
    String adress;

   public boolean fight(Cat anotherCat) {

        if (this.age > age) {
            if (this.weight > weight) {
                if (this.strength > strength) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
            }
       return false;
   }


}

