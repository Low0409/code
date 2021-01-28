package point;

public class Coordinate {

    int x;
    int y;

    public Coordinate() {
        x = 0;
        y = 0;
    }

    void showPlace(int point1X, int point1Y, int point2X, int point2Y) {// 座標を表示
        System.out.printf("%s(%d,%d)%n", "point1の座標", point1X, point1Y);
        System.out.printf("%s(%d,%d)%n", "point2の座標", point2X, point2Y);
    }

    boolean existance(int point1X, int point1Y, int point2X, int point2Y) {// point2が範囲内にあるか判定
        if (point1X >= point1Y && point2X >= point2Y) {
            return true;
        } else {
            return false;
        }
    }

    double pointDistance(double point1X, double point1Y) {// 原点とpoint1の距離を計算
        double multiply01 = Math.pow(point1X, 2);
        double multiply02 = Math.pow(point1Y, 2);
        return Math.sqrt(multiply01 + multiply02);
    }

    double pointDistance(double point1X, double point1Y, double point2X, double point2Y) {// 原点とpoint1の距離を計算
        return Math.sqrt(Math.pow((point2X - point1X), 2) + Math.pow((point2Y - point1Y), 2));
    }
}
