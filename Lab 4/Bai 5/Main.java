
public class Main {
    public static void main(String[] args) {
        GiangVien gv1 = new GVCoHuu();
        System.out.println("Nhap thong tin Giang vien co huu:");
        gv1.nhapThongTin();
        System.out.println("Thong tin Giang vien co huu:");
        gv1.inThongTin();

        System.out.println();
        GiangVien gv2 = new GVThinhGiang();
        System.out.println("Nhap thong tin Giang vien thinh giang:");
        gv2.nhapThongTin();
        System.out.println("Thong tin Giang vien thinh giang:");
        gv2.inThongTin();
    }
}