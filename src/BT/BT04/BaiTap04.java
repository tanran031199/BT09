package BT.BT04;

public class BaiTap04 {
    public static void main(String[] args) {
        Shape c = new Circle("red", 5.5);
        Shape r = new Rectangle("blue", 6, 20);

        c.display();
        System.out.println("Diện tích của hình tròn là: " + c.getArea());
        r.display();
        System.out.println("Diện tích của hình chữ nhật là: " + r.getArea());

    }
}
