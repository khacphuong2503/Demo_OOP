package OOP;

import java.util.*;

public class HoSanXuat extends Ho {


    public HoSanXuat() {
    }

    public double heSoSuDung;


    public void tinhTien() {
        // TODO implement here
        chiSoDien = chiSoMoi - chiSoCu;
        tien =chiSoDien*7000*heSoSuDung;
    }

    public HoSanXuat(int maKH, String tenChuHo, float chiSoCu,  float chiSoMoi, double heSoSuDung) {
        // TODO implement here
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);
        this.heSoSuDung = heSoSuDung;
    }


    public String toString() {
        // TODO implement here
        return "Hộ sản xuất { Mã khách hàng: "+ getMaKH()+", tên chủ hộ: "
                + tenChuHo+", chỉ số cũ: "+ chiSoCu
                + ", chỉ số mới: "+ chiSoMoi + ", chỉ số điện đã sử dụng: "+ chiSoDien+", h số sử dụng: "+ heSoSuDung+ " tiền điện: "+ tien +"}" ;
    }

}