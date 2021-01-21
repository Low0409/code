package point;

import java.util.Random;

public class Last01 {
    public static void main(String[] args) {
        Coordinate ins = new Coordinate();
        Coordinate[] points = new Coordinate[2];
        Random ran = new Random();

        points[0] = new Coordinate();
        points[0].x = ran.nextInt(9) + 1;
        points[0].y = ran.nextInt(9) + 1;

        points[1] = new Coordinate();
        points[1].x = ran.nextInt(9) + 1;
        points[1].y = ran.nextInt(9) + 1;

        ins.showPlace(points[0].x, points[0].y, points[1].x, points[1].y);//座標を表示
        ins.searchPlace(points[0].x, points[0].y, points[1].x, points[1].y);//point2が範囲内にあるか判定
        ins.pointDistance(points[0].x, points[0].y);//原点とpoint1の距離を計算
    }
}