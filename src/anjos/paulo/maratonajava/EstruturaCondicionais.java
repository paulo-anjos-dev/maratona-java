package anjos.paulo.maratonajava;

public class EstruturaCondicionais {
    public static void main(String[] arg){
        float salario = 1000.00F;
        if (salario >= 1000){
            System.out.println("Dentro do if");
        } else if (salario < 1000) {
            System.out.println("Dentro do else if");
        }
        else {
            System.out.println("Dentro do else");
        }
        //Operador ternário (condição ? verdadeiro : falso)
        System.out.println(salario > 5000 ? "Pode doar" : "Não pode doar");
    }
}