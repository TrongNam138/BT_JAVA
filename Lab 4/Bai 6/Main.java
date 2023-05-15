import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        CNKSP cnksp = new CNKSP();
        System.out.println("Nhap thong tin cong nhan khoan san pham:");
        cnksp.nhapThongTin();
        cnksp.tinhLuong();
        cnksp.inThongTin();

        CNTCN cntcn = new CNTCN();
        System.out.println("\nNhap thong tin cong nhan tinh cong nhat:");
        cntcn.nhapThongTin();
        cntcn.tinhLuong();
        cntcn.inThongTin();
    }

}