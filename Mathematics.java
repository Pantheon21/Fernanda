public class Mathematics {
    double num1, num2, total;
    int opcao;

    public void mathematics(){
        switch (opcao) {
            case 1:
                total = num1 + num2; 
                break;
        
            case 2:
                total = num1 - num2;
                break;
            
            case 3:
                total = num1 * num2;
                break;

            case 4:
                total = num1 / num2;
                break;
        }
        System.out.println(total);
    }
}
