package mainPane;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainPaneController {
    //StackPane
    public StackPane stackPane;
    private void changeTop(Node node) {
        ObservableList<Node> childs = this.stackPane.getChildren();

        if (childs.size() > 1) {
            Node topNode = childs.get(childs.size()-1);
            while (node!=topNode){
                topNode.setVisible(false);
                topNode.toBack();
                topNode=childs.get(childs.size()-1);
            }
            topNode.setVisible(true);
        }
    }
    //Quan li ban hang
    public TabPane quanLiBanHang;
    public Tab TimKiemSanPham;
    public Tab XemThongTin;
    public Tab DatHang;
    public Tab ThanhToan;
    public Tab XemTinhTrangDonHang;
    public Tab DuyetChuyenHang;
    public void quanlibanhang(ActionEvent event) {
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
    }
    public void timkiemsanpham(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(TimKiemSanPham);
    }
    public void xemthongtin(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(XemThongTin);
    }
    public void dathang(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(DatHang);
    }
    public void thanhtoan(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(ThanhToan);
    }
    public void xemtinhtrangdonhang(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(XemTinhTrangDonHang);
    }
    public void duyetchuyenhang(ActionEvent event){
        quanLiBanHang.setVisible(false);
        changeTop(quanLiBanHang);
        SingleSelectionModel<Tab> qlbh= quanLiBanHang.getSelectionModel();
        qlbh.select(DuyetChuyenHang);
    }


    //Quan li nhap hang
    public TabPane quanLiNhapHang;
    public Tab CapNhatSanPham;
    public Tab CapNhatHoaDon;
    public Tab CapNhatSoLuong;

    public void quanlinhaphang(ActionEvent event){
        changeTop(quanLiNhapHang);
    }
    public void capnhatsanpham(ActionEvent event){
        quanLiNhapHang.setVisible(false);
        changeTop(quanLiNhapHang);
        SingleSelectionModel<Tab> qlnh= quanLiNhapHang.getSelectionModel();
        qlnh.select(CapNhatSanPham);
    }
    public void capnhathoadon(ActionEvent event){
        quanLiNhapHang.setVisible(false);
        changeTop(quanLiNhapHang);
        SingleSelectionModel<Tab> qlnh= quanLiNhapHang.getSelectionModel();
        qlnh.select(CapNhatHoaDon);
    }
    public void capnhatsoluong(ActionEvent event){
        quanLiNhapHang.setVisible(false);
        changeTop(quanLiNhapHang);
        SingleSelectionModel<Tab> qlnh= quanLiNhapHang.getSelectionModel();
        qlnh.select(CapNhatSoLuong);
    }
    //Bao cao thong ke
    public TabPane baoCaoThongKe;
    public Tab ThongKeDonHang;
    public Tab ThongKeSoLuongSanPham;
    public Tab ThongKeDoanhThu;
    public void baocaothongke(ActionEvent event){
        changeTop(baoCaoThongKe);
    }
    public void thongkedonhang(ActionEvent event){
        baoCaoThongKe.setVisible(false);
        changeTop(baoCaoThongKe);
        SingleSelectionModel<Tab> bctk= baoCaoThongKe.getSelectionModel();
        bctk.select(ThongKeDonHang);
    }
    public void thongkesoluongsanpham(ActionEvent event){
        baoCaoThongKe.setVisible(false);
        changeTop(baoCaoThongKe);
        SingleSelectionModel<Tab> bctk= baoCaoThongKe.getSelectionModel();
        bctk.select(ThongKeSoLuongSanPham);
    }
    public void thongkedoanhthu(ActionEvent event){
        baoCaoThongKe.setVisible(false);
        changeTop(baoCaoThongKe);
        SingleSelectionModel<Tab> bctk= baoCaoThongKe.getSelectionModel();
        bctk.select(ThongKeDoanhThu);
    }

    //Nhan su
    public TabPane nhanSu;
    public Tab ChamCong;
    public Tab Luong;
    public void nhansu(ActionEvent event){
        changeTop(nhanSu);
    }
    public void chamcong(ActionEvent event){
        nhanSu.setVisible(false);
        changeTop(nhanSu);
        SingleSelectionModel<Tab> ns= nhanSu.getSelectionModel();
        ns.select(ChamCong);
    }
    public void luong(ActionEvent event){
        nhanSu.setVisible(false);
        changeTop(nhanSu);
        SingleSelectionModel<Tab> ns= nhanSu.getSelectionModel();
        ns.select(Luong);
    }
    //Tai khoan
    public Pane taiKhoan;
    @FXML
    private TextField ho;
    @FXML
    private TextField ten;
    @FXML
    private TextField socmnd;
    @FXML
    private TextField diachi;
    @FXML
    private SplitMenuButton gioitinh;
    @FXML
    private DatePicker ngaysinh;
    @FXML
    private Button xacnhan;

    public TextField getHo(){
        return this.ho;
    }
    public TextField getTen(){
        return this.ten;
    }
    public TextField getSocmnd(){
        return this.socmnd;
    }
    public TextField getDiachi(){
        return this.diachi;
    }
    public SplitMenuButton getGioitinh(){
        return this.gioitinh;
    }
    public DatePicker getNgaysinh(){
        return this.ngaysinh;
    }
    public Button getXacnhan(){
        return this.xacnhan;
    }

    public void xacNhan(ActionEvent event) {

    }
    public void capnhatthongtin(ActionEvent event) {
        changeTop(taiKhoan);
    }
    public void dangxuat(ActionEvent event){

    }


}
