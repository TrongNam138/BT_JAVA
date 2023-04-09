import java.util.Scanner;

class Diem {
    Scanner input = new Scanner(System.in);
    // Thuộc tính x và y
    private int x;
    private int y;

    // Phương thức khởi tạo mặc định
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    // Phương thức khởi tạo có tham số
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức nhập thông tin điểm
    public void nhapDiem() {
        System.out.print("x: ");
        this.x = Integer.parseInt(input.nextLine());
        System.out.print("y: ");
        this.y = Integer.parseInt(input.nextLine());
    }

    // Phương thức lấy giá trị x
    public int getX() {
        return x;
    }

    // Phương thức lấy giá trị y
    public int getY() {
        return y;
    }

    // Phương thức tính khoảng cách giữa hai điểm
    public double tinhKhoangCach(Diem other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
