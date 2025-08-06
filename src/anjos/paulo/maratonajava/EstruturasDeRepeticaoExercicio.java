package anjos.paulo.maratonajava;
import java.util.Scanner;
public class EstruturasDeRepeticaoExercicio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculadora = true;
        int quantidadeNumeros;
        while (calculadora) {

            System.out.println("------------------Bem Vindo------------------");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Sair");
            System.out.println("-------------------------------------------");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            float valor = 0;
            switch (opcao) {
                case 1:
                    System.out.print("Quantos números deseja somar: ");
                    quantidadeNumeros = scanner.nextInt();
                    for (int contador = 0; contador < quantidadeNumeros; contador++) {
                        System.out.printf("Digite o valor %d: ", contador + 1);
                        float numero = scanner.nextInt();
                        valor += numero;
                    }
                    System.out.printf("A soma dos valores informados é: %.2f.\n", valor);
                    break;
                case 2:
                    System.out.println("Quantos números deseja subtrair: ");
                    quantidadeNumeros = scanner.nextInt();
                    if (quantidadeNumeros > 0) {
                        System.out.print("Digite o valor 1: ");
                        valor = scanner.nextInt();
                        for (int contador = 1; contador < quantidadeNumeros; contador++) {
                            System.out.printf("Digite o valor %d: ", contador + 1);
                            float numero = scanner.nextInt();
                            valor -= numero;
                        }
                    }
                    System.out.printf("A subtração dos valores informados é: %.2f.\n", valor);
                    break;
                case 3:
                    System.out.print("Quantos números deseja dividir: ");
                    quantidadeNumeros = scanner.nextInt();
                    double resultado;
                    if (quantidadeNumeros > 1) {
                        System.out.print("Digite o valor 1: ");
                        resultado = scanner.nextInt();
                        for (int contador = 1; contador < quantidadeNumeros; contador++) {
                            System.out.printf("Digite o valor %d: ", contador + 1);
                            float numero = scanner.nextInt();
                            if (numero == 0) {
                                System.out.println("ERROR: IMPOSSÍVEL DIVIDIR POR 0!");
                                break;
                            }else {
                                resultado /= numero;
                            }
                            System.out.printf("A divisão dos valores informados é: %.2f.\n", resultado);
                        }
                    }else {
                        System.out.println("ERROR: SÓ É POSSÍVEL DIVIDIR SE TIVER PELO MENOS DOIS VALORES!");
                    }
                    break;
                case 4:
                    System.out.println("Quantos números deseja multiplicar: ");
                    quantidadeNumeros = scanner.nextInt();
                    if (quantidadeNumeros > 1) {
                        System.out.print("Digite o valor 1: ");
                        valor = scanner.nextInt();
                        if (valor == 0){
                            System.out.println("Qualquer valor multiplicado por 0, o resultado será 0");
                        }else {
                            for (int contador = 1; contador < quantidadeNumeros; contador++) {
                                System.out.printf("Digite o valor %d: ", contador + 1);
                                float numero = scanner.nextInt();
                                if (numero == 0){
                                    System.out.println("Qualquer valor multiplicado por 0, o resultado será 0");
                                    break;
                                }else {
                                    valor *= numero;
                                }
                                System.out.printf("A multiplicação dos valores informados é: %.2f.\n", valor);
                            }

                        }
                    }else{
                        System.out.println("ERROR: SÓ É POSSÍVEL MULTIPLICAR SE TIVER PELO MENOS DOIS VALORES!");
                    }
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
