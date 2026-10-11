import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input lene ke liye
        System.out.print("Enter the radius of the circle: ");
        double area;
        double r = sc.nextDouble();
       area = 3.1415 * r * r;
       System.out.println("Area of Circle : " + area);
    }
}
