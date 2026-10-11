import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Priciple : ");
        double p = sc.nextDouble();
        System.out.print("Rate : ");
        double r = sc.nextDouble();
        System.out.print("Time : ");
        double t = sc.nextDouble();
        System.out.print("Simple Interest : " + (p * r * t) / 100);
    }
    
}
