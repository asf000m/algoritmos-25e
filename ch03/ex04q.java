import java.util.*;
public class ex04q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que calcule e apresente o valor do resultado da área de uma circunferência (variável A). O programa deve solicitar a entrada do valor do raio da circunferência (variável R). Para a execução deste problema, utilize a fórmula A ← 3.14159265* R ↑ 2. */

        final double PI = 3.14159265;
        System.out.print("Digite o raio -> ");
        double r = sc.nextDouble();

        double area = PI * Math.pow(r, 2);

        System.out.println("Area -> " + area);
    }
}
