import java.util.*;
public class ex04r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Em uma eleição sindical concorreram ao cargo de presidente três candidatos (representados pelas variáveis A, B e C). Durante a apuração dos votos foram computados votos nulos e em branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador que faça a leitura da quantidade de votos válidos para cada candidato, além de ler também a quantidade de votos nulos e em branco. Ao final, o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e, por último, o percentual correspondente de votos em branco em relação à quantidade de eleitores. Todos os cálculos devem efetivamente ser armazenados em memória. */

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
