import java.util.*;
public class ex04n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result = Math.pow((a + b + c), 2);
        System.out.println("Result -> " + result);
    }
}
