package OOP;

import java.util.*;


public abstract class Ho implements InterfaceHo {

    public Ho() {
    }

    private int maKH;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    protected String tenChuHo;


    protected float chiSoCu;

    protected float chiSoMoi;


    public double chiSoDien;

    public double tien;

    public Ho( int maKH,  String tenChuHo,  float chiSoCu, float chiSoMoi) {
        // TODO implement here
        this.maKH = maKH;
        this.tenChuHo = tenChuHo;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;

    }


    public abstract void tinhTien();
    public abstract String toString();
}
