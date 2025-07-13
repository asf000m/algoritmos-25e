import java.util.*;
public class ex04p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salario mensal -> ");
        double sm = sc.nextDouble();
        System.out.print("Enter percentual de reajuste -> ");
        double pr = sc.nextDouble();

        double ns = sm * (1 + pr/100);
        System.out.println("Novo salario -> " + ns);
    }
}
