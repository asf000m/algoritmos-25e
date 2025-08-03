import java.util.*;
public class ex04m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A, B e C) e apresentar como resultado final, armazenado em memória, o valor da soma dos quadrados dos três valores lidos. */

        System.out.print("Valor a -> ");
        int a = sc.nextInt();
        System.out.print("Valor b -> ");
        int b = sc.nextInt();
        System.out.print("Valor c -> ");
        int c = sc.nextInt();

        double result = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        System.out.println("Resultado -> " + result);
    }
}
