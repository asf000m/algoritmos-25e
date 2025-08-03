import java.util.*;
public class ex04h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular, utilizando a fórmula VOLUME ← COMPRIMENTO * LARGURA * ALTURA. */

        System.out.print("Comprimento em cm -> ");
        double length = sc.nextDouble();
        System.out.print("Largura em cm -> ");
        double width = sc.nextDouble();
        System.out.print("Altura em cm -> ");
        double height = sc.nextDouble();

        double volume = length * width * height;
        
        System.out.println("Volume da caixa de " + length + " C x " + width + " L x " + height + " A é " + volume + " cm³");
    }
}
