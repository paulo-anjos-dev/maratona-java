package anjos.paulo.maratonajava;

public class Operadores {
    public static void main(String[] args){
        // Soma( + ), Subtração( - ), Divisão( / ) e Multiplicação( * )
        int a = 10;
        int b = 5;
        System.out.printf("Soma de %d + %d = %d\n", a, b, a + b);
        System.out.printf("Subtração de %d - %d = %d\n", a, b, a - b);
        System.out.printf("Divisão de %d / %d = %d\n", a, b, a / b);
        System.out.printf("Multiplicação de %d * %d = %d\n", a, b, a * b);

        // Resto da Divisão( % )
        float c = 25F;
        float d = 8F;
        System.out.printf("O resto da divisão de %.2f / %.2f = %.0f\n", c, d, c % d);


        //Maior/Menor( > < ), Menor ou igual ( <= ) Maior ou igual ( >= ) Comparação ( == ). Sempre retorna um boolean
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezMenorOuIgualAVinte = 10 <= 20;
        boolean isDezMaiorOuIgualAVinte = 10 >= 20;
        System.out.printf("isDezMaiorQueVinta = %b\n", isDezMaiorQueVinte);
        System.out.printf("isDezMenorQueVinte = %b\n", isDezMenorQueVinte);
        System.out.printf("isDezIgualADez = %b\n", isDezIgualADez);
        System.out.printf("isDezMenorOuIgualAVinte = %b\n", isDezMenorOuIgualAVinte);
        System.out.printf("isDezMaiorOuIgualAVinte = %b\n", isDezMaiorOuIgualAVinte);

        // And( && ) Or ( || ) Not ( ! )
        boolean isDezMaiorQueVinteEDezMenorQueVinte = (10 > 20) && (10 < 20);
        boolean isDezMaiorQueVinteOuDezMenorQueVinte = (10 < 20) || (10 > 20);
        boolean isDezNaoEMenorQueVinte= !(10 < 20);
        System.out.printf("10 > 20 && 10 < 20 ==> %b\n", isDezMaiorQueVinteEDezMenorQueVinte);
        System.out.printf("10 < 20 || 10 > 20 = %b\n", isDezMaiorQueVinteOuDezMenorQueVinte);
        System.out.printf("!(10 < 20) ==> %b\n", isDezNaoEMenorQueVinte);

        // ++ --
        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        ++contador;
        System.out.println(contador);
        --contador;
        System.out.println(contador);
    }
}
