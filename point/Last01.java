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

        ins.showPlace(points[0].x, points[0].y, points[1].x, points[1].y);// 座標を表示
        boolean anser = ins.existance(points[0].x, points[0].y, points[1].x, points[1].y);// point2が範囲内にあるか判定
        if (anser == true) {
            System.out.println("point2は原点とpoint1で形成される四角形のうちにあります");
        } else {
            System.out.println("point2は原点とpoint1で形成される四角形のうちにありません");
        }
        double distance = ins.pointDistance(points[0].x, points[0].y);// 原点とpoint1の距離を計算
        System.out.printf("原点(0,0)とpoint1の2点の距離は%.3f%n", distance);
        double distance1_2 = ins.pointDistance(points[0].x, points[0].y, points[1].x, points[1].y);// point1とpoint2の距離を計算
        System.out.printf("point1とpoint2の二点の距離は%.3f%n", distance1_2);

    }
}