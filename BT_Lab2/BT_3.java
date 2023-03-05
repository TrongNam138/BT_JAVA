package BT_Lab2;

import java.util.Scanner;

public class BT_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ten cua ban: ");
        String name = sc.nextLine();
        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = sc.nextInt();

        int age = 2023 - year;

        if (age >= 18) {
            System.out.println("Ban " + name + " da gia");
        } else if (age >= 16) {
            System.out.println("Ban " + name + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        }
    }
}
