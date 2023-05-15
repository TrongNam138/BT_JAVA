public class HocVienLT extends HocVien{

    private final int DON_GIA = 600000;

    public HocVienLT(){
        this.loaiChuongTrinh = "Lap trinh";
    }

    public HocVienLT(String hoTen, String diaChi, int soBuoiHoc, byte uuTien) {
        super(hoTen, diaChi, soBuoiHoc, uuTien);
        this.loaiChuongTrinh = "Lap trinh";
    }

    @Override
    public void tinhHocPhi() {
        if(this.uuTien == 1){
            this.hocPhi = this.soBuoiHoc * this.DON_GIA - 1000000;
        } else if (this.uuTien == 2) {
            this.hocPhi = this.soBuoiHoc * this.DON_GIA - 800000;
        }
    }
}
