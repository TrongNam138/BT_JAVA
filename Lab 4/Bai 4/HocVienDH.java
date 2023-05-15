public class HocVienDH extends HocVien{

    private final int DON_GIA = 400000;

    public HocVienDH(){
        this.loaiChuongTrinh = "Do hoa";
    }

    public HocVienDH(String hoTen, String diaChi, int soBuoiHoc, byte uuTien) {
        super(hoTen, diaChi, soBuoiHoc, uuTien);
        this.loaiChuongTrinh = "Do hoa";
    }

    @Override
    public void tinhHocPhi() {
        if(this.uuTien == 1){
            this.hocPhi = this.soBuoiHoc * this.DON_GIA - 1000000;
        } else if (this.uuTien == 2) {
            this.hocPhi = this.soBuoiHoc * this.DON_GIA - 500000;
        }
    }
}
