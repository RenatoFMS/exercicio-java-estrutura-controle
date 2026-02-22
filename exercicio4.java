import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        var numero1 = scanner.nextInt();
        int numero2;

        do {
            System.out.println("Digite outro numero:");
            numero2 = scanner.nextInt();
        }
        while (numero2 < numero1 || numero2 % numero1 == 0);
    }

}
