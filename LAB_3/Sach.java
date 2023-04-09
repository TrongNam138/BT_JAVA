import java.util.Scanner;

public class Sach {
    Scanner input = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;

    public void nhapThongTinSach() {
        System.out.print("Nhập mã sách: ");
        this.maSach = input.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = input.nextLine();
        System.out.print("Nhập tên tác giả: ");
        this.tenTacGia = input.nextLine();
        System.out.print("Nhập số trang: ");
        this.soTrang = Integer.parseInt(input.nextLine());
        System.out.print("Nhập loại sách: ");
        this.loaiSach = input.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        this.nhaXuatBan = input.nextLine();
        System.out.print("Nhập số tập: ");
        this.soTap = Integer.parseInt(input.nextLine());
        System.out.print("Nhập giá: ");
        this.gia = Double.parseDouble(input.nextLine());

    }

    // Phương thức in thông tin sách
    public void inThongTinSach() {
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tên sách: " + this.tenSach);
        System.out.println("Tên tác giả: " + this.tenTacGia);
        System.out.println("Số trang: " + this.soTrang);
        System.out.println("Loại sách: " + this.loaiSach);
        System.out.println("Nhà xuất bản: " + this.nhaXuatBan);
        System.out.println("Số tập: " + this.soTap);
        System.out.println("Giá: " + this.gia);
    }
}