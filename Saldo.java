import java.util.Scanner;
public class Saldo {
    Scanner sc = new Scanner(System.in);
    Double saldo = 0.0;
    Double add2;
    Double remove2;
    public void consultar() {
        System.out.println(saldo);
    }
    public void depositar() {
        add2 = sc.nextDouble();
        saldo = saldo + add2;
    }
    public void sacar(){
        remove2 = sc.nextDouble();
        saldo = saldo - remove2;
    }
    public void transferir() {
        System.out.println("Por favor insira o número da conta a transferir ");
        Double conta = sc.nextDouble();
        System.out.println("transferindo para "+ conta + " Por favor insira a quantidade");
        remove2 = sc.nextDouble();
        saldo = saldo - remove2;
    }
}
