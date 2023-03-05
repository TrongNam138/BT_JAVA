package BT_Lab2;

import java.util.Scanner;

public class BT_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("So " + n + " la so chan");
        } else {
            System.out.println("So " + n + " la so le");
        }
    }
}