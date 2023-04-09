public class TamGiac extends Diem {
    // Các thộc tính
    public Diem A;
    public Diem B;
    public Diem C;

    // Hàm khởi tạo mặc định
    public TamGiac() {
        A = new Diem();
        B = new Diem();
        C = new Diem();
    }

    // Hàm khởi tạo với tham số
    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Phương thức nhập tọa độ 3 đỉnh của tam giác
    public void nhapTG() {
        System.out.println("--Nhập tam giác--");
        System.out.println("Nhập tọa độ điểm A:");
        this.A.nhapDiem();
        System.out.println("Nhập tọa độ điểm B:");
        this.B.nhapDiem();
        System.out.println("Nhập tọa độ điểm C:");
        this.C.nhapDiem();
    }

    // Phương thức kiểm tra xem 3 điểm đã nhập có là 3 đỉnh của tam giác không
    public boolean kiemTra() {
        double AB = A.tinhKhoangCach(B);
        double AC = A.tinhKhoangCach(C);
        double BC = B.tinhKhoangCach(C);
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB) {
            return false;
        }
        return true;
    }

    // Phương thức tính chu vi của tam giác
    public double tinhChuVi() {
        if (!kiemTra()) {
            return 0;
        }
        double AB = A.tinhKhoangCach(B);
        double AC = A.tinhKhoangCach(C);
        double BC = B.tinhKhoangCach(C);
        return AB + AC + BC;
    }

    // Phương thức tính diện tích của tam giác
    public double tinhDienTich() {
        if (!kiemTra()) {
            return 0;
        }
        double AB = A.tinhKhoangCach(B);
        double AC = A.tinhKhoangCach(C);
        double BC = B.tinhKhoangCach(C);
        double p = (AB + AC + BC) / 2;
        return Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
    }
}
