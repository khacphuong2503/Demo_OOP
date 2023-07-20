package OOP;

import java.util.*;

public class HoGiaDinh extends Ho {

    public HoGiaDinh() {
    }

    public void tinhTien() {
        // TODO implement here
        chiSoDien = chiSoMoi - chiSoCu;
        if(chiSoDien>100)
            tien = chiSoDien*5500;
        tien = chiSoDien *3500;
    }

    public  HoGiaDinh(int maKH, String tenChuHo,float chiSoCu,float chiSoMoi) {
        // TODO implement here
        super(maKH, tenChuHo, chiSoCu, chiSoMoi);

    }


    public String toString() {
        // TODO implement here
        return "Hộ gia đình { Mã khách hàng: "+ getMaKH()+", tên chủ hộ: "
                + tenChuHo+", chỉ số cũ: "+ chiSoCu
                + ", chỉ số mới: "+ chiSoMoi+", chỉ số điện đã sử dụng: "+ chiSoDien + " tiền điện: "+ tien+"}" ;
    }

}