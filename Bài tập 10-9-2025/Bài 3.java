import java.util.*;    

class TaiKhoan {
    private int stk;
    private String ten;
    private long sodu;
    private static double laiSuatNam = 0.03;

    public TaiKhoan(int stk, String ten, long sodu) {
        this.stk = stk;
        this.ten = ten;
        this.sodu = sodu;
    }

    public int getSTK() {
        return stk;
    }
    public String getTen() {
        return ten;
    }
    public long getSoDu() {
        return sodu;
    }

    public void napTien(long soTien) {
        if (soTien > 0) {
            sodu += soTien;
        } else {
            System.out.println("Số tiền phải lớn hơn 0.");
        }
    }

    public void rutTien(long soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền phải lớn hơn 0.");
        } else if (soTien <= sodu) {
            sodu -= soTien;
        } else {
            System.out.println("Số dư không đủ.");
        }
    }

    public void tinhLaiThang() {
        long tienLai = (long) (sodu * laiSuatNam / 12);
        sodu += tienLai;
    }

    public void display() {
        System.out.printf("STK: %d | Tên: %s | Số dư: %d\n", stk, ten, sodu);
    }

    public static void setLaiSuatNam(double laiSuat) {
        laiSuatNam = laiSuat;
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất năm hiện tại: " + (laiSuatNam * 100) + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách tài khoản
        ArrayList<TaiKhoan> danhSach = new ArrayList<>();
        danhSach.add(new TaiKhoan(1001, "Nguyen Van A", 5000000));
        danhSach.add(new TaiKhoan(1002, "Tran Thi B", 2000000));
        danhSach.add(new TaiKhoan(1003, "Le Van C", 8000000));

        // Hiển thị danh sách ban đầu
        System.out.println("=== Danh sách tài khoản ban đầu ===");
        for (TaiKhoan tk : danhSach) {
            tk.display();
        }

        // Thực hiện một số giao dịch
        danhSach.get(0).napTien(1000000);   // A nạp tiền
        danhSach.get(1).rutTien(500000);    // B rút tiền
        danhSach.get(2).tinhLaiThang();     // C tính lãi 1 tháng

        // Hiển thị danh sách sau khi xử lý
        System.out.println("\n=== Danh sách sau giao dịch ===");
        for (TaiKhoan tk : danhSach) {
            tk.display();
        }

        // Thay đổi lãi suất
        TaiKhoan.setLaiSuatNam(0.07); // đổi thành 7%
        TaiKhoan.hienThiLaiSuat();

        // Tìm kiếm theo số tài khoản
        int soTKCanTim = 1002;
        System.out.println("\n=== Tìm kiếm tài khoản " + soTKCanTim + " ===");
        for (TaiKhoan tk : danhSach) {
            if (tk.getSTK() == soTKCanTim) {
                tk.display();
            }
        }

        danhSach.sort((a, b) -> Long.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\n=== Danh sách sắp xếp theo số dư giảm dần ===");
        for (TaiKhoan tk : danhSach) {
            tk.display();
        }
    }
}