import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input: "); // 從鍵盤輸入三個整數，以空格分隔
        String input = scanner.nextLine();
        scanner.close();

        String[] nums = input.split(" "); // 將輸入的字符串按空格分隔成字符數組

        int num1 = Integer.parseInt(nums[0]); // 將字符串數組中的字符串轉換為整數
        int num2 = Integer.parseInt(nums[1]);
        int num3 = Integer.parseInt(nums[2]);

        double average = (num1 + num2 + num3) / 3.0; // 計算平均值

        System.out.printf("Average: %.2f\n", average); // 輸出平均值，保留小數點後兩位
    }
}