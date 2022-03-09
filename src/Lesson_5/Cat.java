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


    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize(int weight,String color) {
       this.weight = weight;
       this.color = color;
    }
    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }



}

