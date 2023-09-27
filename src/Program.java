import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Crie um programa que mostre os números de 1 até 100");
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        //

        System.out.println("2.Crie um programa que mostre os números de 100  até 1");
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
        //

        System.out.println("3.Crie um programa que some 10 números digitados pelo usuário");
        int soma = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println("Digite o número" + i + ": ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos 10 números: " + soma);
        //

        System.out.println("Crie um programa que mostre de 0 até o número digitado");

        System.out.println("Digite um número: ");
        int numeroDigitado = sc.nextInt();
        for (int i = 0; i < numeroDigitado; i++) {
            System.out.println(i + 1);
        }
        //

        System.out.println("Crie um programa que enquanto não houver o valor de saída digitado (defina um valor), o mesmo apresente a opção para digitar um novo valor");

        boolean sair = false;
        while (!sair) {
            System.out.println("Digite um valor de saída: ");
            int saida = sc.nextInt();

            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();

            if (saida == valor) {
                sair = true;
            } else {
                System.out.println("Voce digitou: " + valor);
            }
        }
    }
}