package anjos.paulo.maratonajava;

public class EstruturasDeRepeticao {
    public static void main(String[] args){
        // While, Do while, For
        int count = 0;

        // Só entra no laço se a condição for verdadeira
        while (count < 10){
            System.out.println("Contador: " + count++);
        }
        System.out.println("Fim do While");

        // Entra pela menos uma vez no laço independete
        // se a condição for verdadeira ou falsa
        do{
            System.out.println("Contador: " + count++);
        }while (count < 10);
        System.out.println("Fim do Do While");

        // Tem um número exato de vezes que vai entrar no laço
        for (int contador = 0; contador < 10; contador++){
            System.out.println("Contador: " + contador);
        }
        System.out.println("Fim do For");
    }
}
