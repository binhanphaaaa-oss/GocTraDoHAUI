package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DuLieu;
import model.NguoiDung;
import model.QuanLyTaiKhoan;

public class QuanLyTaiKhoanForm extends javax.swing.JFrame {
    
  public QuanLyTaiKhoanForm() {
        initComponents(); 
    
    // 2. Sau đó mới gọi nạp dữ liệu vào bảng
    loadTableData(); 
    
    // 3. Cuối cùng là gán sự kiện cho các nút bấm
    btnKhoa.addActionListener(evt -> btnKhoaActionPerformed(evt));
    btnMoKhoa.addActionListener(evt -> btnMoKhoaActionPerformed(evt));
    }

    // Hàm nạp dữ liệu danh sách người dùng lên bảng công khai
    public void loadTableData() {
        DefaultTableModel modelTable = (DefaultTableModel) tableTaiKhoan.getModel();
        modelTable.setRowCount(0); 
        modelTable.setColumnIdentifiers(new Object[]{"Mã SV", "Họ Tên", "Số Điện Thoại", "Trạng Thái"});
        
        for (NguoiDung nd : DuLieu.dsNguoiDung) {
            String status = nd.isBiKhoa() ? "Đã bị khóa" : "Đang hoạt động";
            modelTable.addRow(new Object[]{nd.getMaSV(), nd.getHoTen(), nd.getSoDienThoai(), status});
        }
    }

    // Hành động khi nhấn nút khóa tài khoản
    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int row = tableTaiKhoan.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tài khoản từ bảng!");
            return;
        }
        String maSV = tableTaiKhoan.getValueAt(row, 0).toString();
        if (QuanLyTaiKhoan.khoaTaiKhoan(maSV)) {
            JOptionPane.showMessageDialog(this, "Đã khóa tài khoản thành công!");
            loadTableData();
        }
    }                                       

    // Hành động khi nhấn nút mở khóa tài khoản
    private void btnMoKhoaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int row = tableTaiKhoan.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tài khoản từ bảng!");
            return;
        }
        String maSV = tableTaiKhoan.getValueAt(row, 0).toString();
        if (QuanLyTaiKhoan.moKhoaTaiKhoan(maSV)) {
            JOptionPane.showMessageDialog(this, "Đã mở khóa tài khoản thành công!");
            loadTableData();
        }
    }                                         

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new QuanLyTaiKhoanForm().setVisible(true));
    }
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKhoa = new javax.swing.JButton();
        btnMoKhoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTaiKhoan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKhoa.setText("Khoá tài khoản");

        btnMoKhoa.setText("Mở tài khoản");

        tableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableTaiKhoan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKhoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoKhoa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhoa)
                    .addComponent(btnMoKhoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnMoKhoa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableTaiKhoan;
    // End of variables declaration//GEN-END:variables
}