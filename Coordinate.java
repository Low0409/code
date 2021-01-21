package point;

import java.util.Random;

public class Coordinate {
    static int point01x;
    static int point01y;
    static int point02x;
    static int point02y;

    public void setPlace() {

        Random ran = new Random();

        point01x = ran.nextInt(9) + 1;
        point01y = ran.nextInt(9) + 1;
        point02x = ran.nextInt(9) + 1;
        point02y = ran.nextInt(9) + 1;

        System.out.printf("%s(%d,%d)%n", "point1の座標", point01x, point01y);
        System.out.printf("%s(%d,%d)%n", "point2の座標", point02x, point02y);

    }

    public void searchPlace() {
        if (point01x >= point02x && point01y >= point02y) {
            System.out.println("point2は原点からpoint1の範囲内に存在します");
        } else {
            System.out.println("point2は原点からpoint1の範囲内に存在しません");
        }
    }

    public void pointDistance() {
        int a = point01x * point01x;
        int b = point01y * point01y;
        int c = a + b;
        System.out.printf("原点(0,0)とpoint1の2点の距離は%.3f%n",(Math.sqrt(c)));
    }
}