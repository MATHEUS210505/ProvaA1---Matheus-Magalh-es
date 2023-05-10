import java.util.Scanner;

public class provaA1 {
    public static void main(String[] args) {
        Scanner anobissexto = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = anobissexto.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
        if (bissexto) {
            System.out.println("O Ano digitado é BISSEXTO");
        } else {
            System.out.println("O Ano digitado Não é Bissexto");
        }
    }
}