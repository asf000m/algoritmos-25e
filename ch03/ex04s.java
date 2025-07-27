import java.util.*;
public class ex04s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que leia dois valores numéricos reais desconhecidos representados pelas variáveis A e B. Calcular, armazenar e apresentar os resultados das quatro operações aritméticas básicas. */

        System.out.print("Valor A -> ");
        double a = sc.nextDouble();
        System.out.print("valor B -> ");
        double b = sc.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        System.out.println("suma-> " + sum);
        System.out.println("subtracao -> " + sub);
        System.out.println("multiplicacao -> " + mul);
        System.out.println("divisao -> " + div);
    }
}
