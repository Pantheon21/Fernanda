import java.util.Scanner;
public class Produto {
    Scanner sc = new Scanner(System.in);
    String nome;
    int preço;
    int quantidade;
    int add;
    int remove;
    public void adicionar() {
        System.out.println("quanto você deseja adicionar ao estoque?");
        add = sc.nextInt();
        quantidade = quantidade + add;
        System.out.println("Você adicionou " + quantidade + " Produtos");
    }
    public void estoque() {
        System.out.println(quantidade);
    }
    public void vender() {
        System.out.println("quanto você deseja vender?");
        remove = sc.nextInt();
        quantidade = quantidade - remove;
        System.out.println("Você vendeu " + remove + " Produtos, recebendo R$" + (preço * remove));
    }
} 