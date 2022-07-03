
public class Retangulo {
    public double width;
    public double heigh;

    public double area() {

        return width * heigh;
    }

    public double perimeter() {
        return 2 * (width + heigh);

    }

    public double diagonal() {

        return Math.sqrt(width * width + heigh + heigh);
    }
}
