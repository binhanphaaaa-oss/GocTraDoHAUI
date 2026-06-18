package model;

import java.util.ArrayList;

public class DuLieu {

    public static ArrayList<BaiDang> dsBaiDang =
            new ArrayList<>();
public static ArrayList<NguoiDung> dsNguoiDung =
        new ArrayList<>();
public static NguoiDung nguoiDungDangNhap;
    static {

    

    dsBaiDang.add(new BaiDang(
            "Mất ví da màu đen",
            "Khác",
            "Làm rơi ví gần thư viện khu A",
            "0901111111",
            "Còn đồ",
            "2022600001"
    ));

    dsBaiDang.add(new BaiDang(
            "Nhặt được thẻ sinh viên",
            "Giấy tờ",
            "Nhặt được trước cổng trường",
            "0902222222",
            "Còn đồ",
            "2022600002"
    ));

    dsBaiDang.add(new BaiDang(
            "Mất tai nghe Bluetooth",
            "Đồ điện tử",
            "Đánh rơi tại giảng đường B",
            "0903333333",
            "Còn đồ",
            "2022600001"
    ));

    dsBaiDang.add(new BaiDang(
            "Nhặt được giáo trình Java",
            "Sách vở",
            "Để quên tại phòng C203",
            "0904444444",
            "Đã trả",
            "2022600002"
    ));

    dsBaiDang.add(new BaiDang(
            "Mất áo khoác màu đen",
            "Quần áo",
            "Bỏ quên ở căn tin",
            "0905555555",
            "Còn đồ",
            "2022600001"
    ));

    dsBaiDang.add(new BaiDang(
            "Nhặt được máy tính Casio",
            "Dụng cụ học tập",
            "Nhặt được tại thư viện",
            "0906666666",
            "Còn đồ",
            "2022600002"
    ));

    dsBaiDang.add(new BaiDang(
            "Mất bình nước giữ nhiệt",
            "Khác",
            "Mất ở sân bóng trường",
            "0907777777",
            "Còn đồ",
            "2022600001"
    ));

    dsBaiDang.add(new BaiDang(
            "Nhặt được USB 32GB",
            "Đồ điện tử",
            "USB màu xanh, nhặt tại phòng máy",
            "0908888888",
            "Còn đồ",
            "2022600002"
    ));

    dsBaiDang.add(new BaiDang(
            "Mất balo màu xám",
            "Khác",
            "Để quên tại thư viện tầng 2",
            "0909999999",
            "Còn đồ",
            "2022600001"
    ));

    dsBaiDang.add(new BaiDang(
            "Nhặt được chìa khóa xe",
            "Khác",
            "Nhặt được ở bãi gửi xe",
            "0910000000",
            "Còn đồ",
            "2022600002"
    ));
}

    


    static {

    // Tài khoản mẫu
    dsNguoiDung.add(
        new NguoiDung(
            "2022600001",
            "123",
            "Nguyen Van A",
            "0901111111"
        )
    );
    dsNguoiDung.add(
    new NguoiDung(
        "2022600002",
        "123",
        "Nguyen Van B",
        "0902222222"
    )
);
}
    
}