import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        Aluno a = new Aluno();
        Mathematics m = new Mathematics();
        Produto p = new Produto();
        Saldo s = new Saldo();

        System.out.println("Número 1");
        c.n1 = sc.nextInt();
        System.out.println("Número 2");
        c.n2 = sc.nextInt();
        c.somar();

        System.out.println("Nome");
        a.nome = sc.next();
        System.out.println("Primeira nota");
        a.nota1 = sc.nextDouble();
        System.out.println("Segunda nota");
        a.nota2 = sc.nextDouble();
        System.out.println("Terceira nota");
        a.nota3 = sc.nextDouble();
        a.media();

        System.out.println("Primeiro número");
        m.num1 = sc.nextDouble();
        System.out.println("Segundo número");
        m.num2 = sc.nextDouble();
        System.out.println("Operação: 1=soma, 2=subtração, 3=multiplicação, 4=divisão");
        m.opcao = sc.nextInt();
        m.mathematics();

        System.out.println("informe o nome do produto: ");
        p.nome = sc.next();
         System.out.println("informe o preço do produto: ");
        p.preço = sc.nextInt();
         System.out.println("informe a quantidade em estoque: ");
        p.quantidade = sc.nextInt();
        System.out.println("O que você deseja? 1 adicionar estoque, 2 vender, 3 conferir o estoque, 0 sair.");
        int opcao2 = sc.nextInt();
        while (opcao2 != 0) {
            switch (opcao2) {
                case 1:
                 p.adicionar();
                break;

                case 2:
                 p.vender();
                break;

                case 3:
                 p.estoque();
                break;
            }
        System.out.println("O que você deseja? 1 adicionar estoque, 2 vender, 3 conferir o estoque, 0 sair.");
        opcao2 = sc.nextInt();
        }
        System.out.println("O que você deseja? 1 consultar saldo, 2 depositar, 3 sacar, 4 transferir, 0 sair.");
        int opcao3 = sc.nextInt();
        while (opcao3 != 0) {
            switch (opcao3) {
                case 1:
                 s.consultar();
                break;

                case 2:
                 s.depositar();
                break;

                case 3:
                 s.sacar();
                break;

                case 4:
                 s.transferir();
                break;
            }
        System.out.println("O que você deseja? 1 consultar saldo, 2 depositar, 3 sacar, 4 transferir, 0 sair.");
        opcao3 = sc.nextInt();
    }
}
}