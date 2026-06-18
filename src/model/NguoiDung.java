package model;

public class NguoiDung {
    private String maSV;
    private String matKhau;
    private String hoTen;
    private String soDienThoai;

    public NguoiDung(String maSV, String matKhau,
                     String hoTen, String soDienThoai) {
        this.maSV = maSV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}