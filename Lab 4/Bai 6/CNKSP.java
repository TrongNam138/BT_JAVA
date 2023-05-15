import java.util.Scanner;

class CNKSP extends CongNhan {
    private int soSanPham;
    private double donGiaSanPham;

    public CNKSP(){
        this.loaiCongNhan = "Khoan san pham";
    }

    public void nhapThongTin() {
        Scanner input = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so san pham: ");
        soSanPham = input.nextInt();
        System.out.print("Nhap don gia san pham: ");
        donGiaSanPham = input.nextDouble();
    }

    public void tinhLuong() {
        double thuong = 0;

        if (soSanPham >= 1150){
            thuong = 1500000;
        } else if (soSanPham >= 1100) {
            thuong = 1000000;
        }

        double luongThang = soSanPham * donGiaSanPham + thuong;
        setLuongThang(luongThang);
    }
}
