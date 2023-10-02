package BT.BT02;

public class BaiTap02 {
    public static void main(String[] args) {
    Square s1 = new Square(4);
    Square s2 = new Square(10);
    Rectangle r = new Rectangle(5, 15);
    Circle c = new Circle(5.5);

    Object[] arr = {s1, r, c, s2};

        for (Object o: arr) {
            if(o instanceof Colorable) {
                ((Colorable) o).howToColor();
            }

            if(o instanceof Square) {
                System.out.printf("Diện tích hình vuông là: %.2f\n", ((Square) o).getArea());
            } else if(o instanceof Rectangle) {
                System.out.printf("Diện tích hình chữ nhật là: %.2f\n", ((Rectangle) o).getArea());
            } else if(o instanceof Circle) {
                System.out.printf("Diện tích hình tròn là: %.2f\n", ((Circle) o).getArea());
            }
        }
    }
}
