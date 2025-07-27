import java.util.*;
public class ex04c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula VOLUME ← 3.14159 * R ↑ 2 * ALTURA. */

        final double PI = 3.14159;
        System.out.print("Altura em cm -> ");
        double height = sc.nextDouble();
        System.out.print("Raio em cm -> ");
        double ray = sc.nextDouble();

        double volume = PI * Math.pow(ray, 2) * height;
        double litros = volume / 1000;
        
        System.out.println("O volume da lata é "+ volume +" cm³");
        System.out.println("Equivale a " + litros + " L");
    }
}
