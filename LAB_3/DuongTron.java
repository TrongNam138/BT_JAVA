import java.util.Scanner;

public class DuongTron extends Diem {
    Scanner input = new Scanner(System.in);
    private Diem tam;
    private double banKinh;

    public DuongTron() {
        this.tam = new Diem();
    }

    public DuongTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public void nhapDT() {
        System.out.println("--Nhập đường tròn--");
        System.out.println("Nhập tọa độ tâm: ");
        this.tam.nhapDiem();

        System.out.print("Nhập bán kính: ");
        this.banKinh = Double.parseDouble(input.nextLine());
    }
}
