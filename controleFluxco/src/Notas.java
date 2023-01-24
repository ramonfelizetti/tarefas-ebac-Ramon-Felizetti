import java.util.Scanner;

public class Notas {
    public void calcularNota() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int notaUm = s.nextInt();

        System.out.println("Digite a segunda nota: ");
        int notaDois = s.nextInt();

        System.out.println("Digite a terceira nota: ");
        int notaTres = s.nextInt();

        System.out.println("Digite a quarta nota: ");
        int notaQuatro = s.nextInt();

        Double media = (double) (notaUm +  notaDois + notaTres + notaQuatro) / 4;
        System.out.println("Média Final: " + media);

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
