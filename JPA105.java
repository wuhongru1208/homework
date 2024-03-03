import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入姓名
        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        // 輸入銅板的個數
        System.out.println("Hi, " + name + ",請輸入您的銅板的個數:");

        // 輸入1元、5元、10元、50元硬幣的數量
        System.out.print("請輸入1元的數量: ");
        int coin1 = scanner.nextInt();
        System.out.print("請輸入5元的數量: ");
        int coin5 = scanner.nextInt();
        System.out.print("請輸入10元的數量: ");
        int coin10 = scanner.nextInt();
        System.out.print("請輸入50元的數量: ");
        int coin50 = scanner.nextInt();

        scanner.close();

        // 計算總額
        int totalAmount = coin1 + coin5 * 5 + coin10 * 10 + coin50 * 50;

        // 將總金額拆解成千、百、十、個位元素
        int thousands = totalAmount / 1000;
        int hundreds = (totalAmount % 1000) / 100;
        int tens = (totalAmount % 100) / 10;
        int ones = totalAmount % 10;

        // 輸出結果
        System.out.println("您的錢總共有: " + thousands + " 千 " + hundreds + " 百 " + tens + " 十 " + ones + " 元");
    }
}