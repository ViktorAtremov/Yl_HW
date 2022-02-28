package src.Lesson_3;

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

        System.out.println( te[0] + te[1] + te[2]  + "\n" +
                            te[1] + te[0] + te[2] + "\n" +
                            te[1] + te[2] + te[0] + "\n" +
                            te[2] + te[1] + te[0] + "\n" +
                            te[0] + te[2] + te[1] + "\n" +
                            te[2] + te[0] + te[1]);




    }
}
