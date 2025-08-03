import java.util.*;
public class ex04e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a fórmula PRESTAÇÃO ← VALOR + (VALOR * (TAXA / 100) * TEMPO). */

        System.out.print("Valor original da prestacao -> ");
        double value = sc.nextDouble();
        System.out.print("Percentual da taxa de juros ao mes -> ");
        double interest_rate = sc.nextDouble() / 100;
        System.out.print("Tempo em meses -> ");
        int time = sc.nextInt();

        double installment = value + (value * interest_rate * time);

        System.out.println("O valor da prestacao em atraso é " + installment);
    }
}
