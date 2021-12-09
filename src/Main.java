import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.println("Digite um núemro: ");
            numero = scan.nextInt();

            if(numero>maior) maior = numero;

            soma = soma + numero;

            System.out.println("Soma: " + soma);
            count = count + 1;

        } while (count<5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + soma/5);

    }

}
