import java.awt.*;
import java.util.Scanner;


public abstract class HocVien {
    Scanner input = new Scanner(System.in);

    protected String hoTen;
    protected String diaChi;
    protected String loaiChuongTrinh;
    protected int soBuoiHoc;
    protected byte uuTien;
    protected int hocPhi;

    public HocVien(){

    }
    public HocVien(String hoTen, String diaChi, int soBuoiHoc, byte uuTien){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soBuoiHoc = soBuoiHoc;
        this.uuTien = uuTien;
    }

    public abstract void tinhHocPhi();

    public void nhapThongTin() {
        System.out.print("Ho va ten: ");
        this.hoTen = input.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = input.nextLine();
        System.out.print("Uu tien: ");
        this.uuTien = Byte.parseByte(input.nextLine());
        System.out.print("So buoi hoc: ");
        this.soBuoiHoc = Integer.parseInt(input.nextLine());
    }

    public void inThongTin(){
        this.tinhHocPhi();
        System.out.println("-----");
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Loai chuong trinh: " + this.loaiChuongTrinh);
        System.out.println("Uu tien : " + this.uuTien);
        System.out.println("So buoi hoc: " + this.soBuoiHoc);
        System.out.println("Hoc phi: " + this.hocPhi);
    }
}
