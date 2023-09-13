public class Aluno {
    String nome;
    double nota1, nota2, nota3, media;

    public void media() {
        media = (nota1 + nota2 + nota3)/3;
        if (media >= 7){
            System.out.println(nome + " Aprovado " + media);
        }
        else if(media <4){
            System.out.println(nome + " Reprovado " + media);
        }
        else {
            System.out.println(nome + " Na final " + media);
        }
    }
}
