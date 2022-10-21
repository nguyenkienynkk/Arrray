package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainQuanlysingvien {
    public static void main(String[] args) {
        List<Hocsinh> cachocsinh= new ArrayList<Hocsinh>();
        Scanner scanner = new  Scanner(System.in);
        System.out.println(" Nhập Số Sinh VIên:");
        int so = scanner.nextInt();
        for(int i = 0 ; i<so ;i++){
            System.out.println("sinh viên thứ :" + (i+1));
            String ten = scanner.nextLine();
            System.out.println("Ten sinh vien: " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Điểm của sinh viên thứ : " + (i+1));
            float diem = scanner.nextFloat();
            Hocsinh hs =new Hocsinh(name,diem);
            cachocsinh.add(hs);
        }
        System.out.println("Thông Tin Sinh VIên");
        for (int i =0;i<cachocsinh.size();i++){
            cachocsinh.get(i).inThongTinSinhVien();
        }
    }
}
