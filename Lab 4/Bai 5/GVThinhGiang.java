import java.util.Scanner;

class GVThinhGiang extends GiangVien {
    private int soTietDay;
    private double donGia;

    public GVThinhGiang(){
        this.loaiGiangVien = "Thinh giang";
    }

    public GVThinhGiang(String hoTen, String diaChi, int soTietDay, double donGia){
        super(hoTen, diaChi);
        this.soTietDay =soTietDay;
        this.donGia = donGia;
        this.loaiGiangVien = "Thinh giang";
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner input = new Scanner(System.in);
        System.out.print("So tiet day: ");
        soTietDay = input.nextInt();
        System.out.print("Don gia: ");
        donGia = input.nextDouble();
    }

    public void tinhLuong() {
        double phanTramThuNhap = 0.15 * (soTietDay * donGia);
        this.luongThang = soTietDay * donGia - phanTramThuNhap;
    }
}
