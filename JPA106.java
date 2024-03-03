public class JPA106 {
    public static void main(String[] args) {
        // 計算並顯示 f(-3.2)
        double result1 = f(-3.2);
        System.out.printf("f(-3.2) = %.4f\n", result1);

        // 計算並顯示 f(-2.1)
        double result2 = f(-2.1);
        System.out.printf("f(-2.1) = %.4f\n", result2);

        // 計算並顯示 f(0.0)
        double result3 = f(0.0);
        System.out.printf("f(0.0) = %.4f\n", result3);

        // 計算並顯示 f(2.1)
        double result4 = f(2.1);
        System.out.printf("f(2.1) = %.4f\n", result4);
    }

    // 定義函數 f，計算 f(x) 的值
    public static double f(double x) {
        return 3 * Math.pow(x, 3) + 2 * x - 1;
    }

}