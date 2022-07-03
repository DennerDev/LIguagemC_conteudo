import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();


        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("which percentage to increase salary? ");

        double percentage = sc.nextDouble();
        emp.indreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
