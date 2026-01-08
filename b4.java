import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float width;
        float height;
        float area;
        float perimeter;

        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();

        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.println();
        System.out.println("Diện tích hình chữ nhật = " + area);
        System.out.println("Chu vi hình chữ nhật = " + perimeter);
    }
}
