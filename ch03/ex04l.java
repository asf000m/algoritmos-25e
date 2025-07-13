import java.util.*;
public class ex04l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in reais -> ");
        double reais = sc.nextDouble();
        System.out.print("Enter exchange in dollar -> ");
        double exchange = sc.nextDouble();
    
        double dollar = reais * exchange;
        System.out.println("Value in dollar -> " + dollar);
    }
}
