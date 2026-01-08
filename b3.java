import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Nhập tử số phân số thứ nhất: ");
        a = sc.nextInt();
        System.out.print("Nhập mẫu số phân số thứ nhất: ");
        b = sc.nextInt();

        System.out.print("Nhập tử số phân số thứ hai: ");
        c = sc.nextInt();
        System.out.print("Nhập mẫu số phân số thứ hai: ");
        d = sc.nextInt();

        int numerator = a * d + b * c;
        int denominator = b * d;

        System.out.println();
        System.out.println("Tổng hai phân số là: " + numerator + "/" + denominator);
    }
}
