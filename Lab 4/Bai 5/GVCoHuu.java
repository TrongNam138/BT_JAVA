import java.util.Scanner;

class GVCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSoLuong;
    private int namKinhNghiem;

    public GVCoHuu(){
        this.loaiGiangVien = "Co huu";
    }

    public GVCoHuu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, int namKinhNghiem){
        super(hoTen, diaChi);
        this.luongCoBan =luongCoBan;
        this.heSoLuong = heSoLuong;
        this.namKinhNghiem = namKinhNghiem;
        this.loaiGiangVien = "Co huu";
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner input = new Scanner(System.in);
        System.out.print("Luong co ban: ");
        luongCoBan = input.nextDouble();
        System.out.print("He so luong: ");
        heSoLuong = input.nextDouble();
        System.out.print("Nam kinh nghiem: ");
        namKinhNghiem = input.nextInt();
    }

    public void tinhLuong() {
        double phuCap = 0;
        if (namKinhNghiem < 5) {
            phuCap = 0;
        } else if (namKinhNghiem >= 5) {
            phuCap = (namKinhNghiem - 4) * 0.01 * luongCoBan;
        }
        this.luongThang = luongCoBan * heSoLuong + phuCap;
    }
}