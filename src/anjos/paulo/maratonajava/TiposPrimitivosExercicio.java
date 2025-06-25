package anjos.paulo.maratonajava;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/
public class TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Paulo Dérick Silva dos Anjos";
        String endereco = "Travessa Emídio Martins, Nº583, Centro, Oriximiná-PA";
        float salario = 1000.00F;
        String dataRecebimentoSalario = "25/06/2025";

        System.out.printf("Eu %s, morando no endereço: %s, confirmo que recebi o salário de R$%.2f, na dataRecebimentoSalario %s.", nome, endereco, salario, dataRecebimentoSalario);
    }
}