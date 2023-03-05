package BT_Lab2;

import java.util.Scanner;

public class BT_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Nhap mot so nguyen: ");
            int num = sc.nextInt();
            sum += num;
            if (sum > 100) {
                break;
            }
        }
        System.out.println("Tong cac so da nhap la: " + sum);
    }
}