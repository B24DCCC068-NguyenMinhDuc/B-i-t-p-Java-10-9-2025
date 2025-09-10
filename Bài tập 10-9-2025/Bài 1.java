class HinhChuNhat {
    private int cd;
    private int cr;
    public HinhChuNhat(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }
    public int getArea(int a, int b) {
        return (a * b);
    }
    public int getPerimeter(int a, int b) {
        return (2 * (a + b));
    }
    public void display() {
        System.out.println("Area:" + getArea(cd, cr));
        System.out.println("Perimeter: " + getPerimeter(cd, cr));
    }
}

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(2, 3);
        HinhChuNhat hcn2 = new HinhChuNhat(7, 4);
        hcn1.display();
        hcn2.display();
    }
}