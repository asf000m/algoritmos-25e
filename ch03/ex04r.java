import java.util.*;
public class ex04r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Votos candidato A -> ");
        int votosA = sc.nextInt();
        System.out.print("Votos candidato B -> ");
        int votosB = sc.nextInt();
        System.out.print("Votos candidato C -> ");
        int votosC = sc.nextInt();
        System.out.print("Votos em branco -> ");
        int votosBranco = sc.nextInt();
        System.out.print("Votos nulos -> ");
        int votosNulos = sc.nextInt();

        int votosValidos = votosA + votosB + votosC;
        int votosTotal = votosValidos + votosBranco + votosNulos;
        double percVotosValidos = votosValidos / votosTotal * 100;
        double percVotosA = (double) votosA / votosTotal * 100;
        double percVotosB = (double) votosB / votosTotal * 100;
        double percVotosC = (double) votosC / votosTotal * 100;
        double percVotosBranco = (double) votosBranco / votosTotal * 100;
        double percVotosNulos = (double) votosNulos / votosTotal * 100;

        System.out.println("Total de eleitores -> " + votosTotal);
        System.out.println("Percentual A -> " + percVotosA);
        System.out.println("Percentual B -> " + percVotosB);
        System.out.println("Percentual C -> " + percVotosC);
        System.out.println("Percentual Brancos -> " + percVotosBranco);
        System.out.println("Percentual Nulos -> " + percVotosNulos);
    }
}
