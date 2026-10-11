import java.util.Scanner;
public class sum {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        Double c = sc.nextDouble();
        double sum = a + b + c;
        System.out.println("Sum is : " + sum);

    }
}
