import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaMedias = 0;
        int numeroAlunos = 0;

        while (true) {
            System.out.println("Digite seu nome (ou 'fim' para terminar): ");
            String nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite nota 1: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite nota 2: ");
            double nota2 = entrada.nextDouble();
            entrada.nextLine();

            Dados aluno = new Dados(nome, nota1, nota2);
            double media = aluno.calcularMedia();
            String mensagem = aluno.obterMensagem();

            somaMedias += aluno.calcularMedia();
            numeroAlunos++;
        }

        double mediaTurma = numeroAlunos > 0 ? somaMedias / numeroAlunos : 0;

        System.out.println("Média da turma: " + mediaTurma);
    }
}
