public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Umas das condiçoes e verdadeira");
        }



        String nomeUm = "Guilherme";
        String nomeDois = new String("Guilheme");

        System.out.println(nomeUm.equals(nomeDois));


       int numero1 = 1;
       int numero2 = 2;

       boolean simNao =  numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condicap é verdadeira");
        } else {
            System.out.println("A nossa condicap é verdadeira");
        }


       System.out.println("NumeroUM e igual a numerodOIS? " + simNao);

       simNao = numero1 != numero2;
       System.out.println("NumeroUM e diferente a numerodOIS? " + simNao);

       simNao = numero1 > numero2;
       System.out.println("NumeroUM e maior a numerodOIS? " + simNao);

    }
}
