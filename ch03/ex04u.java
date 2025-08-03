import java.util.*;
public class ex04u {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* Elaborar um programa de computador que calcule e apresente o valor do volume de uma esfera. Utilize a fórmula VOLUME ← (4 / 3) * 3.14159 * (RAIO ↑ 3). */

        final double PI = 3.14159;
        System.out.print("Valor do raio -> ");
        double ray = sc.nextDouble();

        double volume = (4/3) * PI * Math.pow(ray, 3);
        
        System.out.println("Volume da esfera -> " + ray);
    }
}
