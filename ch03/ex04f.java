import java.util.*;
public class ex04f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores após a efetivação do processamento da troca. */

        System.out.print("Valor A -> ");
        double a = sc.nextDouble();
        System.out.print("Valor B -> ");
        double b = sc.nextDouble();

        double x = a;
        a = b;
        b = x;
        
        System.out.println("Novo valor A: " + a);
        System.out.println("Novo valor B: " + b);
    }
}
