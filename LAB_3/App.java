import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // -- BÀI 3.1----------------------------------------------------------
        // System.out.print("Bạn muốn nhập bao nhiêu cuốn sách: ");
        // int n = input.nextInt();
        // Sach[] dsSach = new Sach[n];

        // for (int i = 0; i < n; i++) {
        // dsSach[i] = new Sach();
        // System.out.println("Nhập cuốn sách thứ " + (i + 1) + ": ");
        // dsSach[i].nhapThongTinSach();
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.println("Thông tin cuốn sách thứ " + (i + 1) + ": ");
        // dsSach[i].inThongTinSach();
        // }

        // -- BÀI 3.2----------------------------------------------------------
        TamGiac tg1 = new TamGiac();
        tg1.nhapTG();
        System.out.println("Chu vi: " + tg1.tinhChuVi());
        System.out.println("Diện Tích: " + tg1.tinhDienTich());

        DuongTron dt1 = new DuongTron();
        dt1.nhapDT();
        System.out.println("Chu vi: " + dt1.tinhDienTich());
        System.out.println("Diện tích: " + dt1.tinhChuVi());
    }
}
