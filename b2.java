import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        firstNumber = sc.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println();
        System.out.println("--- Kết quả ---");
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("Tổng = " + sum);
        System.out.println("Hiệu = " + diff);
        System.out.println("Tích = " + product);
        System.out.println("Thương = " + quotient);
        System.out.println("Phần dư = " + remainder);
    }
}
