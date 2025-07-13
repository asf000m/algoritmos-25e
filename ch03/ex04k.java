import java.util.*;
public class ex04k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in dollar -> ");
        double dollar = sc.nextDouble();
        System.out.print("Enter exchange in reais -> ");
        double exchange = sc.nextDouble();

        double reais = dollar * exchange;
        System.out.println("Value in reais -> " + reais);
    }
}
