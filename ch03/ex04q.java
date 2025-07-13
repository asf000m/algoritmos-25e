import java.util.*;
public class ex04q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159265;
        System.out.print("Enter raio -> ");
        double r = sc.nextDouble();
        double area = PI * Math.pow(r, 2);
        System.out.println("Area -> " + area);
    }
}
