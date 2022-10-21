package ArrayList;

public class Hocsinh {
    private String Ten;
    private float Diem;

    public Hocsinh(String ten, float diem) {
        Ten = ten;
        Diem = diem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float diem) {
        Diem = diem;
    }

    public void inThongTinSinhVien(){
        System.out.println("In thông tin sinh viên "+"Tên của học sinh là :"+ this.Ten + "Điểm của sinh viên là :"+this.getDiem());
    }
}