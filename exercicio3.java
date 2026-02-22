import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        var numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero :");
        var numero2 = scanner.nextInt();

        System.out.println("Impar ou par? :");
        var parImpar = scanner.next();

        if(parImpar.equalsIgnoreCase("par")) {
            for (var i = numero2; i >= numero1; i--) {
                if (i % 2 == 1) {

                    continue;
                }
                System.out.println(i);
            }
        }
        else if(parImpar.equalsIgnoreCase("impar")){
                for(var i = numero2;i >= numero1;i--){
                    if(i % 2 == 0){

                        continue;
                    }
                    System.out.println(i);
                }
            }
        }

        }

