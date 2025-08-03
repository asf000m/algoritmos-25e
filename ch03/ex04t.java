import java.util.*;
public class ex04t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Construir um programa que calcule, armazene e apresente em metros por segundo o valor da velocidade de um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos. Utilize a fórmula VELOCIDADE ← (DISTÂNCIA * 1000) / (TEMPO * 60). */

        System.out.print("distancia em km -> ");
        double distance = sc.nextDouble();
        System.out.print("tempo em min -> ");
        double time = sc.nextDouble();

        double velocity = (distance * 1000) / (time * 60);

        System.out.println("velocidade -> " + velocity + " m/s");
    }
}
