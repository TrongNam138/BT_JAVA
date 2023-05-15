import java.util.Scanner;

abstract class GiangVien {

    protected String hoTen;
    protected String diaChi;
    protected String loaiGiangVien;

    protected double luongThang;

    public GiangVien(){

    }

    public GiangVien(String hoTen, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoTen = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
    }

    public abstract void tinhLuong();

    public void inThongTin() {
        this.tinhLuong();
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Loai Giang vien: " + loaiGiangVien);
        System.out.println("Luong thang: " + (long) luongThang);
    }
}