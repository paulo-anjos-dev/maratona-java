package anjos.paulo.maratonajava;
import java.util.Scanner;
public class EstruturasDeRepeticaoExercicio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean calculadora = true;
        while (calculadora){

            System.out.println("------------------Bem Vindo------------------");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Sair");
            System.out.println("-------------------------------------------");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Quantos números deseja somar: ");
                    int quantidadeNumeros = scanner.nextInt();
                    int valor = 0;
                    for (int contador = 0; contador < quantidadeNumeros; contador++){
                        System.out.printf("Digite o valor %d: ", contador + 1);
                        int numero = scanner.nextInt();
                        valor += numero;
                    }
                    System.out.printf("A soma dos valores informados é: %d\n", valor);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    calculadora = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }

    }
}
