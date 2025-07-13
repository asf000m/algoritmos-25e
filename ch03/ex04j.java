import java.util.*;

public class ex04j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = Math.pow((a - b), 2);

        System.out.println("Result: " + result);
    }
}
