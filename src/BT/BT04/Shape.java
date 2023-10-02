package BT.BT04;

public abstract class Shape {
    private String color;

    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public void display() {
        System.out.println("Màu sắc của hình là: " + color);
    }
}
