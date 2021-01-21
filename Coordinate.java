package point;

public class Coordinate {

    int x;
    int y;

    public void showPlace(int point1X, int point1Y, int point2X, int point2Y) {// 座標を表示
        System.out.printf("%s(%d,%d)%n", "point1Xの座標", point1X, point1Y);
        System.out.printf("%s(%d,%d)%n", "point1Yの座標", point2X, point2Y);
    }

    public void searchPlace(int point1X, int point1Y, int point2X, int point2Y) {// point2が範囲内にあるか判定
        if (point1X >= point1Y && point2X >= point2Y) {
            System.out.println("point2は、原点からpoint1の範囲内に存在します");
        } else {
            System.out.println("point2は、原点からpoint1の範囲内に存在しません");
        }
    }

    public void pointDistance(double point1X, double point1Y) {// 原点とpoint1の距離を計算
        double multiply01 = Math.pow(point1X, 2);
        double multiply02 = Math.pow(point1Y, 2);
        double ans = multiply01 + multiply02;
        System.out.printf("原点(0,0)とpoint1の2点の距離は%.3f%n", (Math.sqrt(ans)));
    }
}
