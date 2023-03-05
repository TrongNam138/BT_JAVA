package BT_Lab2;

import java.util.Scanner;

public class BT_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Nhap vao mot so nguyen duong: ");
            num = sc.nextInt();
        } while (num <= 0);

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Giai thua cua " + num + " la: " + factorial);
    }
}
