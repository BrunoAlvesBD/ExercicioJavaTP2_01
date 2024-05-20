
public class Dados {
    String nome;
    double nota1;
    double nota2;

    Dados(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String obterMensagem() {
        double media = calcularMedia();
        if (media >= 6) {
            System.out.println("Média: "+media);
            System.out.println("Aluno provado");
        } else {
            System.out.println("Média: "+media);
            System.out.println("Aluno em prova final");
        }
        return "";
    }
}
