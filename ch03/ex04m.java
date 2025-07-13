import java.util.*;
public class ex04m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        System.out.println("Result -> " + result);
    }
}
