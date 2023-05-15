import java.util.Scanner;

class CNTCN extends CongNhan {
    private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public CNTCN(){
        this.loaiCongNhan = "Tinh cong nhat";
    }

    public void nhapThongTin() {
        Scanner input = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = input.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = input.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = input.nextInt();
    }

    public void tinhLuong() {
        double thuong = 0;

        if (soNgayCong >= 20) {
            thuong = 1.2 * luongCoBan;
        }

        double luongThang = luongCoBan * heSoLuong + thuong;
        setLuongThang(luongThang);
    }
}
