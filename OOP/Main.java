package OOP;

import java.util.Optional;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    List<Ho> dsHo = new ArrayList<>();
//    public static Ho timkiem( List<Ho> dsHo)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap ma khach hang can tim kiem: ");
//        int id = input.nextInt();
//        for(Ho ho: dsHo)
//        {
//            if(ho.maKH == id)
//            {
//                return ho;
//            }
//
//        }
//        return null;
//    }


    public static Ho timkiem(List<Ho> dsHo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng cần tìm kiếm: ");
        int id = input.nextInt();
        Optional<Ho> optionalHo = dsHo.stream()
                .filter(ho -> ho.getMaKH() == id)
                .findFirst();
        return optionalHo.orElse(null);
    }

    public static double tienTB(List<Ho> dsHo)
    {
        double sum = 0;
        for(Ho ho: dsHo)
        {
            sum+= ho.tien;
        }
        return sum/dsHo.size();
    }

//    public static ArrayList<Ho> Max(List<Ho> dsHo)
//    {
//        double max = dsHo.get(0).tien;
//        for( Ho ho: dsHo)
//        {
//            if(ho.tien> max)
//                max = ho.tien;
//        }
//        ArrayList<Ho> dsMax = new ArrayList();
//
//        for(Ho ho: dsHo)
//        {
//            if(ho.tien == max)
//                dsMax.add(ho);
//        }
//        return dsMax;
//    }


    public static List<Ho> Max(List<Ho> dsHo) {
        double max = dsHo.stream()
                .mapToDouble(ho -> ho.tien)
                .max()
                .orElse(0);

        List<Ho> dsMax = dsHo.stream()
                .filter(ho -> ho.tien == max)
                .collect(Collectors.toList());

        return dsMax;
    }

//    public static ArrayList<Ho> MinHSX(List<Ho> dsHo)
//
//    {
//        double min = dsHo.get(0).tien;
//        for(Ho ho: dsHo)
//        {
//            if(ho.getClass() == HoSanXuat.class)
//                if(ho.tien< min)
//                    min = ho.tien;
//        }
//
//
//        ArrayList<Ho> dsMin = new ArrayList();
//        for(Ho ho: dsHo)
//        {
//            if(ho.getClass() == HoSanXuat.class)
//                if(ho.tien == min)
//                    dsMin.add(ho);
//        }
//        return dsMin;
//
//    }

    public static List<Ho> MinHSX(List<Ho> dsHo) {
        double min = dsHo.stream()
                .filter(ho -> ho instanceof HoSanXuat)
                .mapToDouble(ho -> ho.tien)
                .min()
                .orElse(0);

        List<Ho> dsMin = dsHo.stream()
                .filter(ho -> ho instanceof HoSanXuat)
                .filter(ho -> ho.tien == min)
                .collect(Collectors.toList());

        return dsMin;
    }

    public static void main(String args[])
    {

        List<Ho> dsHo = new ArrayList();
        while(true)
        {

            System.out.println("Quản lý tiền điện ");
            System.out.println("1. Load data ");
            System.out.println("2. Tính tiền điện ");
            System.out.println("3. Tìm kiếm theo mã khách hàng ");
            System.out.println("4. Tính tiền điện trung bình ");
            System.out.println("5. Tìm khách hàng có tiền điện cao nhất ");
            System.out.println("6. Tìm khác hàng sản xuất có tiền điện thấp nhất ");
            System.out.println("7. Thoát khỏi ứng dụng ");
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập sự lựa chọn của bạn: ");
            String line =input.nextLine();
            switch(line)
            {
                case "1":
                {
                    HoKinhDoanh hoKinhDoanh01 = new HoKinhDoanh(123,"A",120,960,1.8);
                    dsHo.add(hoKinhDoanh01);

                    HoGiaDinh hoGiaDinh01 = new HoGiaDinh(124,"B",400,450);
                    dsHo.add(hoGiaDinh01);

                    HoKinhDoanh hoKinhDoanh02 = new HoKinhDoanh(125,"C",300,689,1.3);
                    dsHo.add(hoKinhDoanh02);

                    HoSanXuat hoSanXuat01 = new HoSanXuat(126,"D",150,965,1.5);
                    dsHo.add(hoSanXuat01);

                    HoGiaDinh hoGiaDinh02 = new HoGiaDinh(127,"E",500,999);
                    dsHo.add(hoGiaDinh02);

                    HoSanXuat hoSanXuat02 = new HoSanXuat(128,"F",350,987,1.6);
                    dsHo.add(hoSanXuat02);

                    HoSanXuat hoSanXuat03 = new HoSanXuat(129,"G",100,986,1.9);
                    dsHo.add(hoSanXuat03);

                    HoSanXuat hoSanXuat04 = new HoSanXuat(130,"H",100,986,1.9);
                    dsHo.add(hoSanXuat04);
                }
                case "2":
                {
                    for(Ho ho: dsHo)
                    {
                        ho.tinhTien();
                        System.out.println( ho );
                    }
                    break;
                }

                case "3":
                {
                    System.out.println("Khách hàng tìm ra : " + timkiem(dsHo));
                    break;
                }
                case "4":
                {

                    System.out.println("Tiền điện trung bình của : " + tienTB(dsHo));
                    break;
                }
                case "5":
                {
                    System.out.println("Danh sách khách hàng max : " + Max(dsHo));
                    break;
                }
                case "6":
                {
                    System.out.println("Khách hàng sản xuất min : " + MinHSX(dsHo));
                    break;
                }
                case "7":
                {
                    return;
                }

                default:
                    System.out.println("Không hợp lệ");
                    continue;

            }
        }
    }
}

