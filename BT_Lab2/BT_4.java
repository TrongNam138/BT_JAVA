package BT_Lab2;

import java.util.Scanner;

public class BT_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen tu 1 - 12:");
        int n = sc.nextInt();

        String name;
        switch (n) {
            case 1:
                name = "Thang Mot";
                break;
            case 2:
                name = "Thang Hai";
                break;
            case 3:
                name = "Thang Ba";
                break;
            case 4:
                name = "Thang Tu";
                break;
            case 5:
                name = "Thang Nam";
                break;
            case 6:
                name = "Thang Sau";
                break;
            case 7:
                name = "Thang Bay";
                break;
            case 8:
                name = "Thang Tam";
                break;
            case 9:
                name = "Thang Chin";
                break;
            case 10:
                name = "Thang Muoi";
                break;
            case 11:
                name = "Thang Muoi Mot";
                break;
            case 12:
                name = "Thang Muoi Hai";
                break;
            default: // nếu số không hợp lệ thì gán name là rỗng
                name = "So khong hop le";
        }

        System.out.println(name);
    }

}