package OOP;

import java.util.*;

public class HoKinhDoanh extends Ho {

    public HoKinhDoanh() {
    }

    public double heSoSuDung;

    public void tinhTien() {
        // TODO implement here
        chiSoDien = chiSoMoi - chiSoCu;
        if(chiSoDien> 500)
            tien = chiSoDien*heSoSuDung*7000;
        tien = chiSoDien*heSoSuDung*5500;
    }

    public HoKinhDoanh( int maKH, String tenChuHo, float chiSoCu, float chiSoMoi, double heSoSuDung) {
        // TODO implement here
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);
        this.heSoSuDung = heSoSuDung;
    }


    public String toString() {
        // TODO implement here
        return "Hộ kinh doanh { Mã khách hàng: "+ getMaKH()+", tên chủ hộ: "
                + tenChuHo+", chỉ số cũ: "+ chiSoCu
                + ", chỉ số mới: "+ chiSoMoi+", chỉ số điện đã sử dụng: "+ chiSoDien+", hệ số sử dụng: "+ heSoSuDung + " tiền điện: "+ tien +"}";
    }

}//+ " tiền điện: "+ tien