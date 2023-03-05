package BT_Lab2;

import java.util.Scanner;

public class BT_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        float sum = 0;
        float average;

        do {
            System.out.print("Ban muon tinh trung binh cua bao nhieu so: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui long nhap mot so nguyen duong!");
            }
        } while (n <= 0);

        float[] array = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + " :");
            array[i] = sc.nextFloat();
            sum += array[i];
        }

        average = sum / n;
        System.out.println("Trung binh cong cua " + n + " so ban da nhap la: " + average);
    }
}
