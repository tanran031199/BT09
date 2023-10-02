package BT.BT01;

public class BaiTap01 {
    public static void main(String[] args) {
        Resizeable circle = new Circle(5.5);
        Resizeable square = new Square(10);
        Resizeable rectangle = new Rectangle(8, 15);

        circle.resize((Math.random() * (100 - 1)) + 1);
        square.resize((Math.random() * (100 - 1)) + 1);
        rectangle.resize((Math.random() * (100 - 1)) + 1);
    }
}
