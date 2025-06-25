package anjos.paulo.maratonajava;

public class tiposPrimitivos {
    public static void main(String[] args) {
        /**
         * Tabela dos tipos primitivos
         * +-----------+----------------+--------------+-------------------------------------------------------------+
         * | Tipo      | Tamanho (bits) | Valor Padrão | Descrição                                                   |
         * +-----------+----------------+--------------+-------------------------------------------------------------+
         * | byte      | 8              | 0            | Número inteiro de -128 a 127. Usado para economia de memória.|
         * | short     | 16             | 0            | Número inteiro de -32.768 a 32.767. Pouco usado.             |
         * | int       | 32             | 0            | Número inteiro de -2.147.483.648 a 2.147.483.647.            |
         * |           |                |              | Mais usado para inteiros.                                    |
         * | long      | 64             | 0L           | Número inteiro de -9 quintilhões a +9 quintilhões.           |
         * |           |                |              | Usa-se L no final.                                           |
         * | float     | 32             | 0.0f         | Número decimal (ponto flutuante) de precisão simples.        |
         * |           |                |              | Usa-se f no final.                                           |
         * | double    | 64             | 0.0d         | Número decimal de precisão dupla. Mais usado que float.      |
         * | char      | 16             | '\u0000'     | Representa um único caractere Unicode (letras, símbolos, etc.)|
         * | boolean   | 1 (teórico)    | false        | Valores lógicos: true ou false.                              |
         * +-----------+----------------+--------------+-------------------------------------------------------------+
         */

        // byte  | 8 bits  | Número inteiro de -128 a 127. Usado para economia de memória.
        byte valorByte = 127;
        System.out.println(valorByte);

        // short | 16 bits  | Número inteiro de -32.768 a 32.767. Pouco usado.
        short valorShort = 32767;
        System.out.println(valorShort);

        // int   | 32 bits  | Número inteiro de -2.147.483.648 a 2.147.483.647.
        int valorInteiro = 2147483647;
        System.out.println(valorInteiro);

        // long  | 64 bits  | Número inteiro de -9 quintilhões a +9 quintilhões.
        long valorLong = 9000000000000000000L;

        // float | 32 bits  | Número decimal (ponto flutuante) de precisão simples.
        float valorFloat = 10.00F;
        System.out.println(valorFloat);

        // double | 64      | Número decimal de precisão dupla. Mais usado que float.
        double valorDouble = 10.00;
        System.out.println(valorDouble);

        // char   | 16 bits | Representa um único caractere Unicode (letras, símbolos, etc.).
        char valorChar = 'M';
        System.out.println(valorChar);

        // boolean | 1 bit (teórico)  | Valores lógicos: true ou false.
        boolean valorBoolean = true;
        System.out.println(valorBoolean);
    }
}