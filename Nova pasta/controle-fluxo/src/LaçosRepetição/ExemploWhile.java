package LaçosRepetição;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0) {
            double valorDoce = valorAletorio();
            if(valorDoce >  mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho ganhou toda a sua mesada em doces");
    }

    private static double valorAletorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
