import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("qual o seu peso?(kg)");
        var peso = scanner.nextDouble();
        System.out.println("qual a sua altura?(m)");
        var altura = scanner.nextDouble();

        var imc = peso /(altura * altura);

            if (imc <= 18.5){
                System.out.println("Abaixo do peso");
            }
            else if (imc >=18.6 && imc <= 24.9){
                System.out.println("Peso ideal");
            }
            else if (imc >=25 && imc <= 29.9){
                System.out.println("Levemente acima do peso");
            }
            else if (imc >=30 && imc <= 34.9){
                System.out.println("Obesidade Grau I");
            }
            else if (imc >=35 && imc <= 39.9){
                System.out.println("Obesidade Grau II (Severa)");
            }
            else{
                System.out.println("Obesidade III (Mórbida)");
            }
        }

    }
