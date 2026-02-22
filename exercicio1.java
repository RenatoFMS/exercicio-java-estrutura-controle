import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        var numero = scanner.nextInt();
        for (int i = 1;i <= 10;i++){
            int multiplicacao = numero * i;
            System.out.println(multiplicacao);

        }

    }
}
