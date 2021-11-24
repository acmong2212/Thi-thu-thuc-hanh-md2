package quanly_sanpham;

public class SanPham {
    int maSanPham;
    String tenSanPham;
    double gia;
    int soLuong;
    String moTa;
    static int mSanPham;

    public SanPham(String tenSanPham, double gia, int soLuong, String moTa) {
        this.maSanPham = ++mSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public static int getmSanPham() {
        return mSanPham;
    }

    public static void setmSanPham(int mSanPham) {
        SanPham.mSanPham = mSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
