import java.util.Scanner;
import java.lang.Math;

public class JPA104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入第1組座標
        System.out.print("輸入第1組的x和y座標: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // 輸入第2組座標
        System.out.print("輸入第2組的x和y座標: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        scanner.close();

        // 計算兩組座標之間的距離
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 輸出結果
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。\n", x1, y1, x2, y2, distance);
    }
}