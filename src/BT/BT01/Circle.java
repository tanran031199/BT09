package BT.BT01;

public class Circle implements Resizeable {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * r * Math.PI;
    }
    public void display() {
        System.out.println();
        System.out.println("Hình tròn có bán kính: " + r);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
        System.out.println();
    }

    @Override
    public void resize(double percent) {
        if(percent < 1 || percent > 100) {
            System.err.println("Không được vượt quá 1-100%");
        } else {
            System.out.println();
            System.out.printf("Kích thước bán kính trước khi thay đổi là: %.2f\n", r);
            System.out.println("--------------------------------------------------");
            System.out.printf("Kích thước bán kính sau khi thay đổi là: %.2f\n", r + r * percent / 100);
            System.out.println();
        }
    }
}
