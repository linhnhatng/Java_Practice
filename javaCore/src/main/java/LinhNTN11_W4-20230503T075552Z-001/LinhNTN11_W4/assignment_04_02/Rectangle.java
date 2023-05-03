package LinhNTN11_W4.assignment_04_02;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public int getArea() {

        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length * breadth);
    }
}
