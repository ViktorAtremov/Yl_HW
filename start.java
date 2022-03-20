public class start {
    public static void main(String[] args) {
        System.out.println("Привет");
        fun3();
        int x = 1;
        int y = 0;

        y = y + 2 * x;
        x = x * 3;
        // x = x * 16;
        y = y + 2 * x;
       // y = y + x;

        System.out.println(y);


    }
    public static void fun3(){
        int a = 4;
        int b = a;
        int c = 9;
        for (int i = 0; i < 3; i++){
            a++;
            a=a+b;
        }
        c=a-b;
        System.out.println(a+"_"+b+"_"+c);
    }
}

