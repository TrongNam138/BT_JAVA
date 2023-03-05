package BT_Lab2;

import java.util.Scanner;

public class BT_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b;
        System.out.print("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        b = sc.nextInt();

        System.out.println("---------------------------------");

        float tong = a + b;
        float hieu = a - b;
        float tich = a * b;

        System.out.println("Tong cua hai so la: " + tong);
        System.out.println("Hieu cua hai so la: " + hieu);
        System.out.println("Tich cua hai so la: " + tich);

        if (b != 0) {
            float thuong = a / b;
            float du = a % b;

            System.out.println("Thuong cua hai so la: " + thuong);
            System.out.println("Chia lay du cua hai so la: " + du);

        } else
            System.out.println("Khong the chia cho 0");

        System.out.println("---------------------------------");

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
    }
}
