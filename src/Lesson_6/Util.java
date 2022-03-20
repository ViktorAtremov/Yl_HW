package src.Lesson_6;


public class Util {
    static double getDistance(int x1, int y1, int x2, int y2) {
        int ab = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return ab;
    }


}
