package BT.BT01;

public class Rectangle implements Resizeable {
    private double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println();
        System.out.println("Hình chữ nhật có chiều dài: " + height);
        System.out.println("Hình chữ nhật có chiều rộng: " + width);
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
            System.out.printf("Kích thước chiều dài trước khi thay đổi là: %.2f\n", height);
            System.out.printf("Kích thước chiều rộng trước khi thay đổi là: %.2f\n", width);
            System.out.println("---------------------------------------------------");
            System.out.printf("Kích thước chiều dài sau khi thay đổi là: %.2f\n", height + height * percent / 100);
            System.out.printf("Kích thước chiều rộng sau khi thay đổi là: %.2f\n", width + width * percent / 100);
            System.out.println();
        }
    }
}

