import java.util.Scanner;

abstract class CongNhan {
    private String hoTen;
    private String diaChi;
    private String ngaySinh;
    protected String loaiCongNhan;
    private double luongThang;

    public void nhapThongTin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoTen = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = input.nextLine();
    }

    public abstract void tinhLuong();

    public void inThongTin() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Loai cong nhan: " + loaiCongNhan);
        System.out.println("Luong thang: " + luongThang);
    }

    protected void setLuongThang(double luong) {
        luongThang = luong;
    }
}
