/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class QuanLyTaiKhoan {
    // 1. Hàm chức năng KHÓA TÀI KHOẢN
    public static boolean khoaTaiKhoan(String maSV) {
        for (NguoiDung nd : DuLieu.dsNguoiDung) {
            if (nd.getMaSV().equals(maSV)) {
                nd.setBiKhoa(true); // Chuyển trạng thái thành đã khóa
                return true; // Khóa thành công
            }
        }
        return false; // Không tìm thấy sinh viên này
    }

    // 2. Hàm chức năng MỞ TÀI KHOẢN (Mở khóa)
    public static boolean moKhoaTaiKhoan(String maSV) {
        for (NguoiDung nd : DuLieu.dsNguoiDung) {
            if (nd.getMaSV().equals(maSV)) {
                nd.setBiKhoa(false); // Chuyển trạng thái về bình thường
                return true; // Mở khóa thành công
            }
        }
        return false; // Không tìm thấy sinh viên này
    }
}
