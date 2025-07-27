import java.util.*;
public class ex04s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A -> ");
        double a = sc.nextDouble();
        System.out.print("B -> ");
        double b = sc.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        System.out.println("sum -> " + sum);
        System.out.println("sub -> " + sub);
        System.out.println("mul -> " + mul);
        System.out.println("div -> " + div);
    }
}
