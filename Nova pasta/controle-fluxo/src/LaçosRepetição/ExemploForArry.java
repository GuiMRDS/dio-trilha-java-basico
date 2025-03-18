package LaçosRepetição;
public class ExemploForArry {
    public static void main(String[] args) {
        String alunos [] = {"Guilherme", "Jonas", "Julia", "Marcos"};

        //Em Array o indice inicia em Zero 
        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x + " + x + " é " + alunos[x]);
        } 
    }
}
