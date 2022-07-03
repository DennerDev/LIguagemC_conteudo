import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Enter rectangle width and heigh: ");

        rect.width = sc.nextDouble();
        rect.heigh = sc.nextDouble();

        System.out.printf("Area = %2f%n", rect.area());
        System.out.printf("Perimeter = %2f%n", rect.perimeter());
        System.out.printf("Diagonal = %2f%n", rect.diagonal());
    }
}
